package com.example.name_reverse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")

public class NameController {

    @GetMapping(path = "/name1")
    public ResponseEntity<String> namePerson(@RequestParam String name) {
        return ResponseEntity.ok(name);
    }

    @PostMapping(path = "/name2")
    public ResponseEntity<String> namePersonReverse(@RequestParam String name) {
        String reverseName = new StringBuilder(name).reverse().toString();
        return ResponseEntity.ok(reverseName);
    }
}
