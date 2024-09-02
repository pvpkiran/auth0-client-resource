package in.phani.gatewayoauth2client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class OauthClientController {

    @GetMapping("/hello-client")
    public String helloClient(final Principal principal) {
        return "Hello form gateay/oauth client" + " " + principal.getName();
    }
}
