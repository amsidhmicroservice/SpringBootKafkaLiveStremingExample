package com.amsidh.kafka.service;

import com.launchdarkly.eventsource.EventHandler;
import com.launchdarkly.eventsource.EventSource;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.util.concurrent.TimeUnit;

@RequiredArgsConstructor
@Service
@Slf4j
public class WikipediaKafkaProducer {

    private final EventHandler eventHandler;

    public void sendMessage() throws InterruptedException {
        EventSource.Builder builder = new EventSource.Builder(eventHandler, URI.create("https://stream.wikimedia.org/v2/stream/recentchange"));
        final EventSource eventSource = builder.build();
        eventSource.start();
        TimeUnit.MINUTES.sleep(10);
    }

}
