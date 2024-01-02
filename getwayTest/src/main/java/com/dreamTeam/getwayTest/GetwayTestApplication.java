package com.dreamTeam.getwayTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GetwayTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetwayTestApplication.class, args);
	}
	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(r -> r.path("/soapTest/**")
						.filters(f -> f
							.prefixPath("/api")
							.addResponseHeader("Created-By","Dream Team")
						)
						.uri("http://localhost:8081")
				)
				.route(r -> r.path("/rest-test/**")
						.filters(f -> f
								.prefixPath("/api")
								.addResponseHeader("Created-By","Dream Team")
						)
						.uri("http://localhost:8082")
				)
				.route(r -> r.path("/plsqlConnect-test/**")
						.filters(f -> f
								.prefixPath("/api")
								.addResponseHeader("Created-By","Dream Team")
						)
						.uri("http://localhost:8083")
				)
				.build();
	}
}
