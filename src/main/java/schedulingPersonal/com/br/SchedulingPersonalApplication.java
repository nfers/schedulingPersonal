package schedulingPersonal.com.br;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class SchedulingPersonalApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchedulingPersonalApplication.class, args);
    }

}
