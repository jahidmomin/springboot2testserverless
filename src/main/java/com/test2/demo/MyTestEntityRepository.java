package com.test2.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyTestEntityRepository extends JpaRepository<MyTestEntity, Long> {
}