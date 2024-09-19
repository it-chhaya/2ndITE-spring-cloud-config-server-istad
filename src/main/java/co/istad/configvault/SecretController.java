package co.istad.configvault;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class SecretController {

    //@Value("${mine.secret}")
    private String secret;

    @GetMapping("/secrets")
    public Map<String, Object> secret() {
        return Map.of("secret", secret);
    }

}
