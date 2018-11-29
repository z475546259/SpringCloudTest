package com.zzq.springcloud;

import com.zzq.springcloud.entities.cnUser;
import com.zzq.springcloud.utils.ActiveMQManager;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

public class MainEntry {
    public static void main(String[] args) {
        ActiveMQManager activeMQManager = new ActiveMQManager();
        try {
//            activeMQManager.testMQProducerQueue();
//            activeMQManager.TestMQConsumerQueue();
//            activeMQManager.TestTopicProducer();
//            activeMQManager.TestTopicConsumer();
//            cnUser cnUser = new cnUser();
//            cnUser.setChargeTel("15923584508");
//            cnUser.setPassword("475546259");
//            ActiveMQManager.MQProducerQueueSendObj(cnUser);
            ActiveMQManager.MQConsumerQueueReceive();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //连接数据库

        //获取菜鸟user

        //将user放入activeMQ

    }


}
