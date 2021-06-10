package cn.lk.sbmbp.smp.po;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author 6k2
 * @email <a href="mailto:laukaye@qq.com">Email To</a>
 * @date 2021/6/10
 * @desc IntelliJ IDEA: IntelliJ IDEA
 */
@Data
@TableName("test_user")
public class User {

    /**
     * 注解在实体类的某一字段上，表示这个字段对应数据库表的主键
     */
    @TableId
    private Long id;

    private String name;

    private Integer age;

    private String email;

    private Long managerId;

    private LocalDateTime createTime;

}