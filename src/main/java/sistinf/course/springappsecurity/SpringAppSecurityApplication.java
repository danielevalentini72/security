package sistinf.course.springappsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SpringAppSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAppSecurityApplication.class, args);
    }

}
