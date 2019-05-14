package com.company.manage;

import com.github.pagehelper.autoconfigure.PageHelperAutoConfiguration;
import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = "com.company.common.*.dao")
@EnableSwagger2Doc
@SpringBootApplication(scanBasePackages = "com.company", exclude = PageHelperAutoConfiguration.class)
public class ManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManageApplication.class, args);
    }

}
