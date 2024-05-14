package com.example.demo;

import com.example.demo.prop.PlcProp;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class DemoApplication {
    private  final PlcProp plcProp;
    private PlcProp.PlcReadProp encoder;

    @PostConstruct
    public void testYaml() {
        System.out.println("-----------------------------------------");
        System.out.println(plcProp.getConnection());
        System.out.println(plcProp.getRead());
        System.out.println(plcProp.getWrite());
        System.out.println(plcProp.getTotalDistance());
        System.out.println(plcProp.getErrorReportSize());

        encoder = plcProp.getRead().stream().filter(el -> el.getName().equals("encoder")).findFirst()
                .orElseThrow(() -> new RuntimeException("Could not initialize encoder prop"));
        System.out.println(encoder);
        System.out.println("-----------------------------------------");
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
