package com.example.hostelproject.Configs;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfigs {
  @Bean
  public OpenAPI customOpenApi() {
    return new OpenAPI()
        .components(new Components())
        .info(new Info()
            .title("Pacesetters Hostel MGT API")
            .description("API Service for Pacesetter Mobile Application")
            .version("1.0.0")
        );
  }
}
