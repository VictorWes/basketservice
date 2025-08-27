package dev.java.ecommerce.basketservice.config;

import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfiguration {


    @Bean
    public OpenAPI getOpenAPI(){

        Contact contact = new Contact();
        contact.name("Victor");
        contact.email("victor.infowb@gmail.com");

        Info info = new Info();
        info.title("BasketService");
        info.version("v1");
        info.description("Aplicação consumindo uma API externa para realizar testes com cache utilizando Redis");
        info.contact(contact);


        return new OpenAPI().info(info);


    }


}
