package com.interswitch.qstoreecrservice;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class QstoreEcrServiceApplication{

	@Autowired
	private MerchantRepo merchantRepo;

	public static void main(String[] args) {
		SpringApplication.run(QstoreEcrServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner logMerchants() {
		return args -> {
			List<Merchant> merchants = merchantRepo.findAll();
			for (Merchant merchant : merchants) {
				System.out.println("Merchant info: " + merchant.toString());
			}
		};
	}


}
