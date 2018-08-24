package com.example.springbootdemo.Queue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

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
public class JMSConsumer {
    private final static Logger logger = LoggerFactory.getLogger(JMSConsumer.class);

    @JmsListener(destination = "springboot.queue.test")
    public void receiveQueue(String msg) {
        logger.info("接收到消息：{}",msg);
    }
}