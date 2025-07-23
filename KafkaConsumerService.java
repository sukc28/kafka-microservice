package com.example.microservice;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {
    @KafkaListener(topics = "test-topic", groupId = "group_id")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}
