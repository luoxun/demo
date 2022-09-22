package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.example.facade.SampleJvmSrv;

@SpringBootApplication
@RestController

public class DemoApplication {

	// @SofaReference
	// private SampleJvmService sampleJvmService;

	@SofaReference
	private SampleJvmSrv sampleJvmSrv;

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
		System.out.printf("over..........");

	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String hello() {
		// System.out.printf("----..........");
		return sampleJvmSrv.message();
		// RunnableDemo::start()
		// return "{\"code\":200,\"message\":\"success version2\"}";

		// return "google";
	}
}
