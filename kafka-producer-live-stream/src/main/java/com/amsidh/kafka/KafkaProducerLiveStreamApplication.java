package com.amsidh.kafka;

import com.amsidh.kafka.service.WikipediaKafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RequiredArgsConstructor
@SpringBootApplication
public class KafkaProducerLiveStreamApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(KafkaProducerLiveStreamApplication.class, args);
    }

    private final WikipediaKafkaProducer wikipediaKafkaProducer;

    @Override
    public void run(String... args) throws Exception {
        wikipediaKafkaProducer.sendMessage();
    }
}
