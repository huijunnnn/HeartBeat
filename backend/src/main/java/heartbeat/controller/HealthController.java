package heartbeat.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.actuate.health.HealthEndpoint;
import org.springframework.boot.actuate.health.Status;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
@RequiredArgsConstructor
public class HealthController {
    private final HealthEndpoint healthEndpoint;

    @GetMapping
    public Status getHealthStatus() {
        return healthEndpoint.health().getStatus();
    }
}
