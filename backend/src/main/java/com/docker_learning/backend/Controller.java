package com.docker_learning.backend;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
//@RequestMapping("/api")
//@Tag(name = "Pisya")
public class Controller {

    @GetMapping("/")
    public ResponseEntity<List<Entity>> index() {
        List<Entity> entities = new ArrayList<>();
        entities.add(new Entity(1, "First", "First description"));
        entities.add(new Entity(2, "Second", "Second description"));
        entities.add(new Entity(3, "Third", "Third description"));
        return ResponseEntity.ok(entities);
    }
}
