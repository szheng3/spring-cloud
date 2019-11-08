package com.cloud.firstservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FirstController {
    @GetMapping("/test")
    public Mono<String> test(@RequestHeader("X-first-Header") String headerValue){
        return Mono.just(headerValue);
    }
}
