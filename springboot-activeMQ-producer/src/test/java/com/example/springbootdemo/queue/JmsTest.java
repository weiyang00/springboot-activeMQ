package com.example.springbootdemo.queue;

import com.example.springbootdemo.BaseTest;
import com.example.springbootdemo.utils.JMSProducer;
import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jms.Destination;

/**
 * Created by weiyang on 2018/8/24.
 *
 * @Author: weiyang
 * @Package com.example.springbootdemo
 * @Project: springboot-activeMQ
 * @Title:
 * @Description: Please fill description of the file here
 * @Date: 2018/8/24 10:03
 */
public class JmsTest extends BaseTest {
    @Autowired
    private JMSProducer jmsProducer;

    @Test
    public void testJms() {
        Destination destination = new ActiveMQQueue("springboot.queue.test");

        for (int i=0;i<10;i++) {
            jmsProducer.sendMessage(destination,"hello,world!" + i);
        }
    }
}