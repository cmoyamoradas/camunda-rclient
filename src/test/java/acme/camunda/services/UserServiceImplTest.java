package acme.camunda.services;

import acme.camunda.entities.User;
import java.util.List;
import java.util.Iterator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.web.reactive.function.client.WebClient;

import acme.camunda.services.UserService;
import acme.camunda.services.UserServiceImpl;


 public class UserServiceImplTest {
    @Test
    void successListUsers(){
        WebClient.Builder webClientBuilder = WebClient.builder();
        System.setProperty("baseUrl","https://reqres.in");

        UserService userService = new UserServiceImpl(webClientBuilder);

        List<User> users = userService.listUsers();

        Assertions.assertNotNull(users);
        Assertions.assertTrue(users.size()==6);

    }

    @Test
     void successFirstUserIsNamedGeorgeListUsers(){
        WebClient.Builder webClientBuilder = WebClient.builder();
        System.setProperty("baseUrl","https://reqres.in");

        UserService userService = new UserServiceImpl(webClientBuilder);

        List<User> users = userService.listUsers();

        Assertions.assertNotNull(users);
        Assertions.assertTrue(users.get(0).getFirst_name().equals("George"));
    }

}
