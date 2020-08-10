package com.tcet.tc_spring.controller;

import com.tcet.tc_spring.domain.Topic;
import com.tcet.tc_spring.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Locale;

@Controller
public class TopicController {

    @Autowired
    private TopicService topicservice;

    @GetMapping("/topic")
    public String topicForm(Locale locale, Model model) {
        model.addAttribute("topics", topicservice.list());
        return "editTopics";

    }

    @ModelAttribute("topic")
    public Topic formBackingObject() {
        return new Topic();
    }

    @PostMapping("/addTopic")
    public String saveEmployee(@ModelAttribute("topic") @Valid Topic topic,
                               BindingResult result, Model model) {

        if (result.hasErrors()) {
            model.addAttribute("topics", topicservice.list());
            return "editTopics";
        }
        topicservice.save(topic);
        return "redirect:/topic";


    }
}

