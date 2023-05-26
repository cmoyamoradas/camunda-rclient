package acme.camunda.services;

import acme.camunda.entities.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.reactive.function.client.WebClient;

import org.springframework.core.ParameterizedTypeReference;


import java.util.List;

public class UserServiceImpl implements UserService {

    private final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    public static final String BASE_URL = System.getProperty("baseUrl");

    WebClient.Builder apiClientBuilder;

    public UserServiceImpl(WebClient.Builder apiClientBuilder){
        this.apiClientBuilder = apiClientBuilder;
        this.apiClientBuilder.baseUrl(BASE_URL);
    }

    @Override
    public List<User> listUsers(){
        Response response = this.apiClientBuilder.build()
                .get()
                .uri("/api/users?page=1")
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<Response>() {})
                .block();
        return response.getData();

    }

}
