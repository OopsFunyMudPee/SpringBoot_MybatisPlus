package cn.lk.sbmbp.smp.mappers;

import cn.lk.sbmbp.smp.entity.Person;
import cn.lk.sbmbp.smp.po.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.JedisSentinelPool;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        assertEquals(231, list.size());
        list.forEach(System.out::println);
    }

    @Test
    public void demo1() {
        Person person = new Person.Builder().name("testName").location("shanghai").habit("football").job("it").build();
        System.out.println(person);
    }

    @Test
    public void demo2() {
        Set<String> sentinels = new HashSet<>();
        sentinels.add("192.168.2.150:16379");
        sentinels.add("192.168.2.150:26379");
        sentinels.add("192.168.2.150:36379");
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxTotal(10);
        jedisPoolConfig.setMaxIdle(5);
        jedisPoolConfig.setMinIdle(5);
        jedisPoolConfig.setMaxWaitMillis(1000);
        JedisSentinelPool sentinelPool = new JedisSentinelPool("mymaster", sentinels, jedisPoolConfig, "123456");
        try (Jedis jedis = sentinelPool.getResource()) {//获取客户端
            //执行两个命令
            jedis.set("test2", "myvalue3");
            String myvalue = jedis.get("test2");
            //打印信息
            System.out.println(myvalue);
            System.out.println(jedis.get("test1"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}