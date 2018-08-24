package com.example.springbootdemo.queue.topic;

import com.example.springbootdemo.BaseTest;
import com.example.springbootdemo.utils.JMSProducer;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jms.Queue;
import javax.jms.Topic;

/**
 * Created by weiyang on 2018/8/24.
 *
 * @Author: weiyang
 * @Package com.example.springbootdemo.queue.topic
 * @Project: springboot-activeMQ
 * @Title:
 * @Description: Please fill description of the file here
 * @Date: 2018/8/24 10:15
 */
public class JmsTopicTest extends BaseTest {
    @Autowired
    private JMSProducer jmsProducer;
    @Autowired
    private Topic topic;
    @Autowired
    private Queue queue;

    @Test
    public void testJms() {
        for (int i=0;i<10;i++) {
            jmsProducer.sendMessage(queue,"queue,world!" + i);
            jmsProducer.sendMessage(topic, "topic,world!" + i);
        }
    }
}