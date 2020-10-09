package com.test.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;
import com.vecv.cep.utils.serviceImpl.MetaDataConverterServiceImpl;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	MetaDataConverterServiceImpl metaDataConverterServiceImpl()
	{
		return new MetaDataConverterServiceImpl();
	}
}
