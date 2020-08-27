package com.example.demo;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Service.impl.PDFTransformationServiceImpl;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.itextpdf.text.DocumentException;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException, DocumentException {
		SpringApplication.run(DemoApplication.class, args);
		PDFTransformationServiceImpl pdf = new PDFTransformationServiceImpl();
		pdf.transform("{\"name\":\"Test\", \"address\":\"Test\", \"nationality\":\"Indian\"}", "C:\\work\\checkout");
	}

}
