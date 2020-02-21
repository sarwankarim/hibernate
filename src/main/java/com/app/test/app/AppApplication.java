package com.app.test.app;

import com.app.test.app.dao.PaymentRepository;
import com.app.test.app.dao.StudentRepository;
import com.app.test.app.model.CardPayment;
import com.app.test.app.model.ChequePayment;
import com.app.test.app.model.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private StudentRepository repository;

	@Autowired
	private PaymentRepository paymentRepository;

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

	@Override
	public void run(String... args) {
		logger.info("Student id 10001 -> {}", repository.findById(10001L));

		logger.info("All users 1 -> {}", repository.findAll());

		//Insert
		logger.info("Inserting -> {}", repository.save(new Student("John", "A1234657")));

		//Update
		logger.info("Update 10001 -> {}", repository.save(new Student(10001L, "Name-Updated", "New-Passport")));

		//repository.deleteById(10001L);

		logger.info("All users 2 -> {}", repository.findAll());

		logger.info("Save payment -> {}", paymentRepository.save(new CardPayment(10000d, "card payment","1111-2222-3333-4444", "GOLD")));
		logger.info("Save payment -> {}", paymentRepository.save(new ChequePayment(10000d, "card payment","1234567", "URGENT")));
	}
}
