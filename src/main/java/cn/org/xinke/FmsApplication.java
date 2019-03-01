package cn.org.xinke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @description 主程入口
 * @author cinco
 * @date 2019-1-21
 */
@SpringBootApplication
public class FmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(FmsApplication.class, args);
    }

}

