package com.test2.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    private MyTestEntityRepository myTestEntityRepository;

    @GetMapping("/api/test")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("Testing");
    }

    @GetMapping("/api/getData")
    public ResponseEntity<?> getData() {
        return ResponseEntity.ok(myTestEntityRepository.findAll());
    }
}
