package com.ritallus.ms_users.configs;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.responses.ApiResponse;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(new Info().title("POC - RITALLUS - MS-USERS").description(
                        "This is the documentation for Ritallus - MSUsers"));
    }

    @Bean
    public ApiResponse apiResponse() {return new ApiResponse();}
}