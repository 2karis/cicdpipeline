package com.kariuki.cicdpipelline.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping
    public ResponseEntity<Map<String,String>> index(){
        return ResponseEntity.ok().body(Map.of("Status","up and running"));
    }
}
