package com.user_authentication.user_authentication.Config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OpenAPIConfig {

    @Value("${dayo.openapi.dev-url}")
    private String devUrl;



    @Bean
    public OpenAPI myOpenAPI() {
        Server devServer = new Server();
        devServer.setUrl(devUrl);
        devServer.setDescription("Server URL in Development environment");

        Contact contact = new Contact();
        contact.setEmail("dayobalogun221@gmail.com");
        contact.setName("Dayo");
        contact.setUrl("https://www.linkedin.com/in/dayo-balogun-8959b9106/");


        Info info = new Info()
                .title("User Reg API")
                .version("1.0")
                .contact(contact)
                .description("For User registration.");

        return new OpenAPI().info(info).servers(List.of(devServer));
    }
}
