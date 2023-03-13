package com.example.general.domain;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Log4j2
public class KafkaSendMessages {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String topicName,String msg) {
        kafkaTemplate.send(topicName, msg);
        log.info("-------------");
        log.info("ОТПРАВИЛ СООБЩЕНИЕ");
        log.info("-------------");
    }
}
