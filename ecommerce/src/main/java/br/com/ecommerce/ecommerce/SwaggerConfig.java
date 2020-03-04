package br.com.ecommerce.ecommerce;

import static springfox.documentation.builders.PathSelectors.regex;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.models.Contact;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("br.com.ecommerce.ecommerce"))
				.paths(regex("/ecommerce.*"))
				.build().apiInfo(metaInfo());
	}

	

	private ApiInfo metaInfo() {
		
		
		@SuppressWarnings("rawtypes")
		ApiInfo apiInfo = new ApiInfo("API REST", "API ECOMMERCE", "1.0", "dont have Terms",
				new springfox.documentation.service.Contact("Marcio", "http://www.resource.com.br", "marcio.santos@qintess.com"),
				"Apache License", 
				"www.apache.org/license.html", 
				new ArrayList<VendorExtension>());
		return apiInfo;
	}

}
