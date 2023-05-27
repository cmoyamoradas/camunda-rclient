package acme.camunda;

import acme.camunda.entities.User;
import acme.camunda.services.UserService;
import acme.camunda.services.UserServiceImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.context.annotation.Bean;

import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CamundaClientApplication {
    private final static Logger LOGGER = LoggerFactory.getLogger(CamundaClientApplication.class);
    public static void main(String[] args) {

        WebClient.Builder webClientBuilder = WebClient.builder();

        UserService userService = new UserServiceImpl(webClientBuilder);

        List<User> users = userService.listUsers();

        Iterator<User> it = users.iterator();
        while (it.hasNext()) {
            LOGGER.info(it.next().toString());
        }
    }
}