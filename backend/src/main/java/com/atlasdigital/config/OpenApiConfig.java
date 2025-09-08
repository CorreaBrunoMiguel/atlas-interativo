package com.atlasdigital.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Author: Bruno Miguel Correa
 * Email: devsistemascorrea@gmail.com
 * Data: 08/09/2025
 **/

@Configuration
public class OpenApiConfig {
	
	@Bean
	public OpenAPI atlasOpenAPI() {
		return new OpenAPI()
				.info(new Info().title("Atlas Digital API")
						.description("API para indicadores populacionais, socioeconomicos e climaticos")
						.version("v0.1")
						.license(new License().name("MIT").url("https://opensource.org/licenses/MIT\"")))
				.externalDocs(new ExternalDocumentation()
						.description("Repositorio do Projeto")
						.url("https://github.com/CorreaBrunoMiguel/atlas-interativo"));
	}
}
