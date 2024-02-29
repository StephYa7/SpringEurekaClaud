package st.springcloudprac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudPracApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudPracApplication.class, args);
    }

}