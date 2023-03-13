package com.example.general.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class KafkaSendMessages {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String topicName,String msg) {
        kafkaTemplate.send(topicName, msg);
    }
}
