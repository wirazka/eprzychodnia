package pl.sda.eprzychodnia.config;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Setter
@Getter
@ConfigurationProperties(prefix = "patients.service")
public class PatientsServiceConfig {
    private String url;

}
