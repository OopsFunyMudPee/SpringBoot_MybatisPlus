package cn.lk.sbmbp.smp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 6k2
 * @email <a href="mailto:laukaye@qq.com">Email To</a>
 * @date 2021/6/10
 * @desc MybatisPlusApplication: springboot 启动类
 */
@SpringBootApplication
@MapperScan("cn.lk.sbmbp.smp.mappers")
public class MybatisPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusApplication.class, args);
    }

}
