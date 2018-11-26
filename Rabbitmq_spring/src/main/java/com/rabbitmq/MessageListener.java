package com.rabbitmq;

import com.rabbitmq.config.ApplicationConfigReader;
import com.rabbitmq.dto.UserDetails;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Message Listener for RabbitMQ
 *
 *
 */

@Service
public class MessageListener {

    @Autowired
    ApplicationConfigReader applicationConfigReader;

    
    /**
     * Message listener for app1
     * @param UserDetails a user defined object used for deserialization of message
     */
    @RabbitListener(queues = "${app1.queue.name}")
    public void receiveMessage(final UserDetails data) {
    	System.out.println("Received message from app1 queue, Data="+data);
    	

    }
}
