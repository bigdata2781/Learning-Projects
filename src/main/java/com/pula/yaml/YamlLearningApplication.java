package com.pula.yaml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties
public class YamlLearningApplication {
	@Autowired
	private ReadYamlFile readYamlFile;
	
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(YamlLearningApplication.class, args);
		
		YamlLearningApplication application = context.getBean(YamlLearningApplication.class);
		
		application.readYamlFile.readViaConfigurationProperties();
		
		application.readYamlFile.readViaYamlAPI();
	}
}