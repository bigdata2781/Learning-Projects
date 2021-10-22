package com.pula.yaml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.yaml.snakeyaml.Yaml;

@Component
public class ReadYamlFile {
	@Autowired
	private YamlPropertiesContainer yamlPropertiesContainer;
	
	public void readViaConfigurationProperties() {
		yamlPropertiesContainer.logProperties();
	}
	
	public void readViaYamlAPI() {
		Yaml yaml = new Yaml();
		Object yamlContent = yaml.load("application.yaml");
		
		System.out.println(yamlContent);
	}
}
