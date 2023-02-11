package com.adri.AdriInternship_MattikaTongsai;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories("com.adri.AdriInternship_MattikaTongsai")
@EntityScan("com.adri.AdriInternship_MattikaTongsai")
@SpringBootApplication
public class AdriInternshipMattikaTongsaiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdriInternshipMattikaTongsaiApplication.class, args);
	}

}


