package com.tcet.tc_spring.dao;

import com.tcet.tc_spring.domain.Login;
import com.tcet.tc_spring.domain.Topic;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.TypedQuery;
import java.util.List;

@Component
public class TopicDaoImpl implements TopicDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(Topic topic) {
        sessionFactory.getCurrentSession().save(topic);
    }

    @Override
    public List<Topic> list() {
        TypedQuery<Topic> query = sessionFactory.getCurrentSession().createQuery("from Topic");
        return query.getResultList();
    }

    @Override
    public Topic getTopic(Integer id) {
        TypedQuery<Topic> query = sessionFactory.getCurrentSession().createQuery("from Topic where id=:id");
        query.setParameter("id",id);
        return query.getSingleResult();
    }

    @Override
    public void delete(Integer id) {
        Topic topic = new Topic();
        topic.setId(id);
        sessionFactory.getCurrentSession().delete(topic);
    }

    @Override
    public Topic authenticate(Login login) {
        return null;
    }


}

