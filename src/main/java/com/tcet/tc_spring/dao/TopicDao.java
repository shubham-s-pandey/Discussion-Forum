package com.tcet.tc_spring.dao;

import com.tcet.tc_spring.domain.Login;
import com.tcet.tc_spring.domain.Topic;
import java.util.List;

public interface TopicDao {
    void save(Topic topic);

    List<Topic> list();

    Topic getTopic(Integer id);
    void delete(Integer id);
    Topic authenticate(Login login);

}
