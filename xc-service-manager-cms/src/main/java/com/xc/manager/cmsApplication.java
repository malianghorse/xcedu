package com.xc.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan
//@EntityScan
public class cmsApplication {

 public static void main(String[] args) {
  SpringApplication.run(cmsApplication.class);
 }
}
