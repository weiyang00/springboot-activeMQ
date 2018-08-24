package com.example.springbootdemo.utils;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Destination;

/**
 * Created by weiyang on 2018/8/24.
 *
 * @Author: weiyang
 * @Package com.example.springbootdemo.utils
 * @Project: springboot-activeMQ
 * @Title:
 * @Description: Please fill description of the file here
 * @Date: 2018/8/24 9:53
 */
@Component
public class JMSProducer {
    @Autowired
    private JmsTemplate jmsTemplate;

    public void sendMessage(Destination destination, String message) {
        this.jmsTemplate.convertAndSend(destination, message);
    }
}