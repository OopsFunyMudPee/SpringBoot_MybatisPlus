package cn.lk.sbmbp.smp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author 6k2
 * @email <a href="mailto:laukaye@qq.com">Email To</a>
 * @date 2021/6/10
 * @desc App: springboot 启动类
 */
//开启定时
@EnableScheduling
@SpringBootApplication
@MapperScan("cn.lk.sbmbp.smp.mappers")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
