package com.amsidh.kafka.repository;

import com.amsidh.kafka.entity.Wikipedia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikipediaRepository extends JpaRepository<Wikipedia, Long> {
}
