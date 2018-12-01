package com.zzq.springcloud;

import com.zzq.springcloud.entities.cnUser;
import com.zzq.springcloud.utils.ActiveMQManager;
import com.zzq.springcloud.utils.MysqlManager;
import com.zzq.springcloud.utils.RecordToFile;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;
import java.util.List;

public class MainEntry {
    public static void main(String[] args) {
        //先消费掉消息队列没消费完的消息
        try {
            ActiveMQManager.MQConsumerQueueReceive();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //获取菜鸟user
        List<cnUser> cnUserList = MysqlManager.getCNUsers();
        //将user放入activeMQ
        for (cnUser user:cnUserList) {
            try {
                ActiveMQManager.MQProducerQueueSendObj(user);
            } catch (Exception e) {
                RecordToFile.record(new String[]{user.getTelephone()+"放入消息队列失败",e.getMessage()}, "error-log.txt",true);
            }
        }
    }
}
