package com.example.demo;

import com.example.demo.props.MyAppProps;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
@RequiredArgsConstructor
public class DemoApplication {
    private final MyAppProps properties;

    @EventListener(ApplicationReadyEvent.class)
    public void test() {
        System.out.println(properties);
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
