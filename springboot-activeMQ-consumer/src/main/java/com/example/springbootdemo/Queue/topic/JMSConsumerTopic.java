package com.example.springbootdemo.Queue.topic;

import com.example.springbootdemo.Queue.JmsConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * Created by weiyang on 2018/8/24.
 *
 * @Author: weiyang
 * @Package com.example.springbootdemo.Queue.topic
 * @Project: springboot-activeMQ
 * @Title:
 * @Description: Please fill description of the file here
 * @Date: 2018/8/24 10:13
 */
@Component
public class JMSConsumerTopic {
    private final static Logger logger = LoggerFactory.getLogger(JMSConsumerTopic.class);

    @JmsListener(destination = JmsConfig.TOPIC,containerFactory = "jmsListenerContainerTopic")
    public void onTopicMessage(String msg) {
        logger.info("接收到topic消息：{}",msg);
    }

    @JmsListener(destination = JmsConfig.QUEUE,containerFactory = "jmsListenerContainerQueue")
    public void onQueueMessage(String msg) {
        logger.info("接收到queue消息：{}",msg);
    }
}