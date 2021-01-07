package hr.rassus.lab;

import hr.rassus.lab.model.Measurement;
import hr.rassus.lab.repo.MeasurementRepository;
import hr.rassus.lab.rest.MeasurementController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LabApplication implements CommandLineRunner {

	@Autowired
	MeasurementController controller;


	public static void main(String[] args) {

		SpringApplication.run(LabApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		controller.insertReadings();
	}
}
