package cn.lk.sbmbp.smp.po;


import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author 6k2
 * @email <a href="mailto:laukaye@qq.com">Email To</a>
 * @date 2021/6/10
 * @desc IntelliJ IDEA: IntelliJ IDEA
 */
@Data
public class User {
    private Long          id;
    private String        name;
    private Integer       age;
    private String        email;
    private Long          managerId;
    private LocalDateTime createTime;
}