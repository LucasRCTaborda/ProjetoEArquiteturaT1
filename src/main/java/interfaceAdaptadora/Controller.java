package interfaceAdaptadora;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/home")
    @CrossOrigin(origins = "/home")
    public String welcomeMessage() {
        return ("Bem vindo as lojas ACME");
    }
}
