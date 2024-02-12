package org.guru.fakestore.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebRequestConfig {

    @Bean
    public WebClient webClient() {
        return WebClient.builder()
                .baseUrl("https://fakestoreapi.com/products")
                .build();

    }
}
