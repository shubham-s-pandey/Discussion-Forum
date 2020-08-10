package com.tcet.tc_spring.service;

import com.tcet.tc_spring.domain.Topic;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface TopicService {
    List<Topic> list();

    void save(Topic topic);

    void delete(Integer id);

    @Transactional(readOnly = true)
    Topic getTopic(Integer id);
}
