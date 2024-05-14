package com.example.demo.prop;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Data
@Configuration
@ConfigurationProperties(prefix = "plc")
@EnableConfigurationProperties(PlcProp.class)
public class PlcProp {

    Connection connection;
    List<PlcReadProp> read;
    List<PlcWriteProp> write;
    int totalDistance;
    int errorReportSize;

    @Data
    public static class Connection {
        String ip;
        int port, rack, slot;
    }

    @Data
    public static class PlcReadProp {
        String name;
        int db, offset, quantity;
    }

    @Data
    public static class PlcWriteProp {
        String name;
        int db, offset;
        List<Integer> bits;
    }
}
