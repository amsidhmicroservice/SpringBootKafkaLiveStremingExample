package com.amsidh.kafka.service;

import com.amsidh.kafka.entity.Wikipedia;
import com.amsidh.kafka.repository.WikipediaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Slf4j
public class WikipediaService {
    private final WikipediaRepository wikipediaRepository;

    @KafkaListener(topics = "${spring.kafka.topic.name}", groupId = "${spring.kafka.consumer.groupId}")
    public void consumeWikipediaMessage(String message) {
        log.info("Message consumed: {}", message);
        wikipediaRepository.save(Wikipedia.builder().message(message).build());
    }
}
