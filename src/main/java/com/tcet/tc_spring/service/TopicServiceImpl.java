package com.tcet.tc_spring.service;

import com.tcet.tc_spring.dao.TopicDao;
import com.tcet.tc_spring.domain.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class TopicServiceImpl implements TopicService {
    @Autowired
    private TopicDao topicDao;

    @Transactional
    @Override
    public void save(Topic user) {
        topicDao.save(user);
    }


    @Override
    @Transactional
    public void delete(Integer id) {
        topicDao.delete(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Topic> list() {
        return topicDao.list();
    }

    @Transactional(readOnly = true)
    @Override
    public Topic getTopic(Integer id) {
        return topicDao.getTopic(id);
    }
}
