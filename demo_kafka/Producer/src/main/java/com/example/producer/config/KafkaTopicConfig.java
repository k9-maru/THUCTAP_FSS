package com.example.producer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic firstTopic (){
        NewTopic topic = TopicBuilder.name("topic1").partitions(3).replicas(1).build();
        System.out.println(topic);
        return topic;
    }
}
