package edutech.backend;

import edutech.backend.config.JwtConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableConfigurationProperties(JwtConfig.class)
@SpringBootApplication
@EnableDiscoveryClient
public class EduTechBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(EduTechBackendApplication.class, args);
	}
}
