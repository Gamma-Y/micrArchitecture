package ru.smirnov.miniservice.metrics;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Metric {
    @GetMapping("/health")
    public StatusDTO getStatusOk() {
        return new StatusDTO("OK");
    }

}
