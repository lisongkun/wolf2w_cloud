package cn.wolfcode.wolf2w.article;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"cn.wolfcode.wolf2w.core", "cn.wolfcode.wolf2w.article"})
@EnableFeignClients
@SpringBootApplication
public class Wolf2wArticleApplication {

    public static void main(String[] args) {
        SpringApplication.run(Wolf2wArticleApplication.class, args);
    }
}
