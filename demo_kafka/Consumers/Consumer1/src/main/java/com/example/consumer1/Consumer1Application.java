package com.example.consumer1;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.kafka.config.TopicBuilder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@SpringBootApplication
public class Consumer1Application {
//    KafkaConsumer<String, String> kafkaConsumer = new KafkaConsumer<String, String>(consumerConfig());
//
//    private ConsumerRecords<String, String> consumerRecords;

    public static void main(String[] args) {
        SpringApplication.run(Consumer1Application.class, args);
    }

    @Bean
    public NewTopic topic() {
        return TopicBuilder.name("topic1")
                .partitions(3)
                .replicas(1)
                .build();
    }

    @Bean
    public boolean receive(KafkaConsumer<String, String> kafkaConsumer) {
        kafkaConsumer.subscribe(Collections.singletonList("topic1"));
        while (true) {
            ConsumerRecords<String, String> consumerRecords = kafkaConsumer.poll(200);
//            for (ConsumerRecord cr : consumerRecords
//            ) {
//                System.out.println(
//                        "----------------------------------\n"
//                                + "Partition: " + cr.partition() + "\n"
//                                + "Offset: " + cr.offset() + "\n"
//                                + "Key: " + cr.key() + "\n"
//                                + "Value: " + cr.value()
//                );
//            }

            List<ConsumerRecord> listRecords = new ArrayList<>();
            for (ConsumerRecord cr : consumerRecords) {
                listRecords.add(cr);
            }
            Collections.sort(listRecords, new Comparator<ConsumerRecord>() {
                @Override
                public int compare(ConsumerRecord cr1, ConsumerRecord cr2) {
                    return String.valueOf(cr1.key()).compareTo(String.valueOf(cr2.key()));
                }
            });
            for (ConsumerRecord item : listRecords
            ) {
                System.out.println(
                        "----------------------------------\n"
                                + "Partition: " + item.partition() + "\n"
                                + "Offset: " + item.offset() + "\n"
                                + "Key: " + item.key() + "\n"
                                + "Value: " + item.value()
                );
            }
        }
    }

    @KafkaListener(/*groupId = "spring.kafka.consumer.group-id", */topics = "topic1",
            topicPartitions = {@TopicPartition(topic = "topic1", partitions = {"0-2"})})
    public void listen0(String in) {
        System.out.println(in);
    }
}


