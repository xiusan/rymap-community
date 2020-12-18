package com.xjl.springcloud;

import com.xjl.myrule.MySelfRule;
import com.xjl.springcloud.lb.MyLB;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration=MyLB.class)
public class CloudConsumerOrder80Application {

	public static void main(String[] args) {
		SpringApplication.run(CloudConsumerOrder80Application.class, args);
	}

}
