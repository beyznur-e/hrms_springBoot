package com.example.hrms_springBoot;

import business.abstracts.JobService;
import entities.concretes.Job;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@SpringBootApplication
public class HrmsSpringBootApplication {

	public static void main(String[] args) {

		SpringApplication.run(HrmsSpringBootApplication.class, args);

	}

}
