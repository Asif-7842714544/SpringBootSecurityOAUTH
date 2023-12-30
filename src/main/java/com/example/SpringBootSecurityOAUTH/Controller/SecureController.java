package com.example.SpringBootSecurityOAUTH.Controller;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.OAuth2AccessToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class SecureController {

    @GetMapping("/hii")
    public String getMessage(OAuth2AuthenticationToken oAuth2AccessToken){
        System.out.println("Token"+oAuth2AccessToken.getPrincipal());
        return "Hii Asif";
    }

}
