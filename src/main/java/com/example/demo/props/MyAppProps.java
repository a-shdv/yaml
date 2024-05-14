package com.example.demo.props;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "myapp")
public class MyAppProps {
    private List<MyAppProp> myAppProps;

    @Override
    public String toString() {
        return "MyAppProps{" +
                "myAppProps=" + myAppProps +
                '}';
    }
}