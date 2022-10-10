package com.cosmos.meetingapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class MeetingapiApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(MeetingapiApplication.class, args);
	}

}
