package cn.wolfcode.wolf2w.comment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"cn.wolfcode.wolf2w.core", "cn.wolfcode.wolf2w.comment"})
@SpringBootApplication
public class Wolf2wCommentApplication {

    public static void main(String[] args) {
        SpringApplication.run(Wolf2wCommentApplication.class, args);
    }
}
