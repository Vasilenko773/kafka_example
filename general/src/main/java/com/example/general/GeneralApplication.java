package com.example.general;

import com.example.general.domain.KafkaListenerMessages;
import com.example.general.domain.KafkaSendMessages;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication(scanBasePackages = {"com.example.consumer", "com.example.producer", "com.example.general"})
@PropertySource(value = {"classpath:application-producer.properties", "classpath:application-consumer.properties"})
public class GeneralApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(GeneralApplication.class, args);
        KafkaSendMessages messanger = context.getBean(KafkaSendMessages.class);
        KafkaListenerMessages listener = context.getBean(KafkaListenerMessages.class);
        messanger.sendMessage("topicNam", "helloWorld");
//        listener.listenGroupFoo("");


    }

}
