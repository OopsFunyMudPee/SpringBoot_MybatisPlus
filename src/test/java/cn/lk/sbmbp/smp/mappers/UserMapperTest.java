package cn.lk.sbmbp.smp.mappers;

import cn.lk.sbmbp.smp.po.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author 6k2
 * @email <a href="mailto:laukaye@qq.com">Email To</a>
 * @date 2021/6/10
 * @desc IntelliJ IDEA: IntelliJ IDEA
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Resource
    private UserMapper mapper;

    @Test
    public void demo() {
        List<User> list = mapper.selectList(null);
        assertEquals(5, list.size());
        list.forEach(System.out::println);
    }

}