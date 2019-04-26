package org.coastline.common.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


/**
 * start server
 *
 * @author Jay.H.Zou
 * @date 2019/1/31
 */
@MapperScan(basePackages = {"org.coastline.common.web"})
@ImportResource("classpath:common/beans.xml")
@SpringBootApplication
public class CommonWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonWebApplication.class, args);
    }

}
