package com.zzq.springcloud.utils;

import com.zzq.springcloud.entities.cnUser;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQObjectMessage;

import javax.jms.*;
import java.io.Serializable;

public class ActiveMQManager {
    public static void MQProducerQueueSendObj(Object obj) throws Exception{
        //1、创建工厂连接对象，需要制定ip和端口号
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://120.77.202.205:61616");
        //2、使用连接工厂创建一个连接对象
        Connection connection = connectionFactory.createConnection();
        //3、开启连接
        connection.start();
        //4、使用连接对象创建会话（session）对象
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        //5、使用会话对象创建目标对象，包含queue和topic（一对一和一对多）
        Queue queue = session.createQueue("cnUser-queue");
        //6、使用会话对象创建生产者对象
        MessageProducer producer = session.createProducer(queue);
        producer.setDeliveryMode(DeliveryMode.PERSISTENT);
        //7、使用会话对象创建一个消息对象
        ObjectMessage objectMessage = session.createObjectMessage();
        objectMessage.setObject((Serializable) obj);
        //8、发送消息
        producer.send(objectMessage);
        //9、关闭资源
        producer.close();
        session.close();
        connection.close();
    }

    public static void MQConsumerQueueReceive() throws Exception{
        //1、创建工厂连接对象，需要制定ip和端口号
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://120.77.202.205:61616");
        ((ActiveMQConnectionFactory) connectionFactory).setTrustAllPackages(true);
        //2、使用连接工厂创建一个连接对象
        Connection connection = connectionFactory.createConnection();
        //3、开启连接
        connection.start();
        //4、使用连接对象创建会话（session）对象
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        //5、使用会话对象创建目标对象，包含queue和topic（一对一和一对多）
        Queue queue = session.createQueue("cnUser-queue");
        //6、使用会话对象创建生产者对象
        MessageConsumer consumer = session.createConsumer(queue);

        ActiveMQObjectMessage activeMQObjectMessage  = (ActiveMQObjectMessage)consumer.receive(1000);
        while (activeMQObjectMessage!=null){
            cnUser cnUser = (cnUser) activeMQObjectMessage.getObject();
            RecordToFile.record(new String[]{cnUser.getTelephone()+"没有被消费"}, "info-log.txt",true);
            activeMQObjectMessage  = (ActiveMQObjectMessage)consumer.receive(1000);
        }
        //9、关闭资源
        consumer.close();
        session.close();
        connection.close();
    }


    public void TestTopicProducer() throws Exception{
        //1、创建工厂连接对象，需要制定ip和端口号
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://120.77.202.205:61616");
        //2、使用连接工厂创建一个连接对象
        Connection connection = connectionFactory.createConnection();
        //3、开启连接
        connection.start();
        //4、使用连接对象创建会话（session）对象
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        //5、使用会话对象创建目标对象，包含queue和topic（一对一和一对多）
        Topic topic = session.createTopic("test-topic");
        //6、使用会话对象创建生产者对象
        MessageProducer producer = session.createProducer(topic);
        //7、使用会话对象创建一个消息对象
        TextMessage textMessage = session.createTextMessage("hello!test-topic");
        //8、发送消息
        producer.send(textMessage);
        //9、关闭资源
        producer.close();
        session.close();
        connection.close();
    }

    public void TestTopicConsumer() throws Exception{
        //1、创建工厂连接对象，需要制定ip和端口号
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://120.77.202.205:61616");
        //2、使用连接工厂创建一个连接对象
        Connection connection = connectionFactory.createConnection();
        //3、开启连接
        connection.start();
        //4、使用连接对象创建会话（session）对象
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        //5、使用会话对象创建目标对象，包含queue和topic（一对一和一对多）
        Topic topic = session.createTopic("test-topic");
        //6、使用会话对象创建生产者对象
        MessageConsumer consumer = session.createConsumer(topic);
        TextMessage textMessage  = (TextMessage)consumer.receiveNoWait();
//        System.out.println(textMessage.getText());
        //7、向consumer对象中设置一个messageListener对象，用来接收消息
//        consumer.setMessageListener(new MessageListener() {
//
//            @Override
//            public void onMessage(Message message) {
//                // TODO Auto-generated method stub
//                if(message instanceof TextMessage){
//                    TextMessage textMessage = (TextMessage)message;
//                    try {
//                        System.out.println(textMessage.getText());
//                    } catch (JMSException e) {
//                        // TODO Auto-generated catch block
//                        e.printStackTrace();
//                    }
//                }
//            }
//        });
        //8、程序等待接收用户消息
//        System.in.read();
        //9、关闭资源
        consumer.close();
        session.close();
        connection.close();
    }

    public static void TopicProducerSendObj(Object obj) throws Exception{
        //1、创建工厂连接对象，需要制定ip和端口号
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://120.77.202.205:61616");
        //2、使用连接工厂创建一个连接对象
        Connection connection = connectionFactory.createConnection();
        //3、开启连接
        connection.start();
        //4、使用连接对象创建会话（session）对象
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        //5、使用会话对象创建目标对象，包含queue和topic（一对一和一对多）
        Topic topic = session.createTopic("cnUser-topic");
        //6、使用会话对象创建生产者对象
        MessageProducer producer = session.createProducer(topic);
        //7、使用会话对象创建一个消息对象
        ObjectMessage objectMessage = session.createObjectMessage();
        objectMessage.setObject((Serializable) obj);
        //8、发送消息
        producer.send(objectMessage);
        //9、关闭资源
        producer.close();
        session.close();
        connection.close();
    }

    public static void TopicConsumerReceiveObj() throws Exception{
        //1、创建工厂连接对象，需要制定ip和端口号
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://120.77.202.205:61616");
        //2、使用连接工厂创建一个连接对象
        Connection connection = connectionFactory.createConnection();
        //3、开启连接
        connection.start();
        //4、使用连接对象创建会话（session）对象
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        //5、使用会话对象创建目标对象，包含queue和topic（一对一和一对多）
        Topic topic = session.createTopic("cnUser-topic");
        //6、使用会话对象创建生产者对象
        MessageConsumer consumer = session.createConsumer(topic);
        //7、向consumer对象中设置一个messageListener对象，用来接收消息
        consumer.setMessageListener(new MessageListener() {

            @Override
            public void onMessage(Message message) {
                // TODO Auto-generated method stub
                if(message instanceof ActiveMQObjectMessage){
                    ActiveMQObjectMessage activeMQObjectMessage = (ActiveMQObjectMessage)message;
                    try {
                        cnUser cnUser = (cnUser) activeMQObjectMessage.getObject();
                        System.out.println(cnUser.toString());
                    } catch (JMSException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        });
        //8、程序等待接收用户消息
//        System.in.read();
        //9、关闭资源
        consumer.close();
        session.close();
        connection.close();
    }
}
