package com.example.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class ProducerApplication {

    @Bean
    public boolean send(KafkaTemplate<String, String> kafkaTemplate) {
        String key = "";
        for (int i = 0; i < 12; i++) {
            if (i <= 3) {
                key = "car";
                kafkaTemplate.send("topic1", key, "msg + key:" + key);
            } else if (i > 3 && i <= 6) {
                key = "bike";
                kafkaTemplate.send("topic1", key, "msg + key:" + key);
            } else if (i > 6 && i <= 9) {
                key = "plane";
                kafkaTemplate.send("topic1", key, "msg + key:" + key);
            } else {
                key = null;
                kafkaTemplate.send("topic1", key, "msg + key:" + key);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication.class, args);
    }
}
