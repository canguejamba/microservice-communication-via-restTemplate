/**
 * Created by IntelliJ IDEA.
 * User: Cangue.Jamba
 * Project name: microservice-communication-via-restTemplate
 */
package io.blog.comment;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CommentServiceApp {
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
    public static void main(String[] args) {
        SpringApplication.run(CommentServiceApp.class, args);
    }
}

