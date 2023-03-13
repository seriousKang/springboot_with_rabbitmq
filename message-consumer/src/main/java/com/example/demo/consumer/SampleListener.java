package com.example.demo.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SampleListener {
    @RabbitListener(queues = "sample.queue")
    public void receiveMessage(Message message) {
        log.info("message = {}", message.toString());
        log.info("message body = {}", new String(message.getBody()));
    }
}
