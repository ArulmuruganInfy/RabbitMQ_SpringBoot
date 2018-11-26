package com.rabbitmq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

/**
 * Message sender to send message to queue using exchange.
 *
 */

@Component
public class MessageSender {

	/**
	 * 
	 * @param rabbitTemplate
	 * @param exchange
	 * @param routingKey
	 * @param data
	 */
	public void sendMessage(RabbitTemplate rabbitTemplate, String exchange, String routingKey, Object data) {
		System.out.println("Sending message to the queue using RoutingKey="+routingKey+", Data="+data);
		rabbitTemplate.convertAndSend(exchange, routingKey, data);
		System.out.println("The message has been sent to the queue.");
	}

}
