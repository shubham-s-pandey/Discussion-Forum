package com.tcet.tc_spring.domain;

import javax.persistence.*;

@Entity
@Table(name = "topic")
@Inheritance(strategy = InheritanceType.JOINED)
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String topic;
    private String post;

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", topic='" + topic + '\'' +
                ", post='" + post + '\'' +
                '}';
    }

}
