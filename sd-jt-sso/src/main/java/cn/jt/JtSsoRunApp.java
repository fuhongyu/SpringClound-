package cn.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringCloudApplication
@EnableFeignClients
public class JtSsoRunApp {
	public static void main(String[] args) {
		SpringApplication.run(JtSsoRunApp.class, args);
	}
	
}
