package cn.edu.cqupt.mis.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


/**
 * @author dengsiyuan
 * @Date 2018.9.21
 */
@SpringBootApplication
@ImportResource(value = "spring-config.xml")
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
