package com.example.metrics;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Gauge;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.Random;

@RestController
public class MetricController {

    private final AtomicInteger randomMetric;

    public MetricController(MeterRegistry registry) {
        randomMetric = new AtomicInteger(new Random().nextInt(40) + 10);
        Gauge.builder("custom_random_metric", randomMetric, AtomicInteger::get)
             .description("A randomly generated metric between 10 and 50")
             .register(registry);
    }

    @GetMapping("/metric")
    public int getRandomMetric() {
        int value = new Random().nextInt(40) + 10;
        randomMetric.set(value);
        return value;
    }

    @GetMapping("/grafana")
    public String grafanaRedirect() {
        return "Grafana is running at http://localhost:3000";
    }
}
