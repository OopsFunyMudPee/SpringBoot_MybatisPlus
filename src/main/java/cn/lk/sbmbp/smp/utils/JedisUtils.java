package cn.lk.sbmbp.smp.utils;


/**
 * @author 6k2
 * @email <a href="mailto:laukaye@qq.com">Email To</a>
 * @date 2021/6/16
 * @desc IntelliJ IDEA: IntelliJ IDEA
 */
public class JedisUtils {

//    public static void main(String[] args) {
//        try {
//            Set<String> sentinels = new HashSet<>();
//            sentinels.add("192.168.2.150:16379");
//            sentinels.add("192.168.2.150:26379");
//            sentinels.add("192.168.2.150:36379");
//
//            JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
//            jedisPoolConfig.setMaxTotal(10);
//            jedisPoolConfig.setMaxIdle(5);
//            jedisPoolConfig.setMinIdle(5);
//
//            JedisSentinelPool sentinelPool = new JedisSentinelPool("myMaster", sentinels, jedisPoolConfig, null);
//            //获取客户端
//            Jedis jedis = sentinelPool.getResource();
//            //执行两个命令
//            jedis.set("mykey", "myvalue");
//            String myvalue = jedis.get("mykey");
//            //打印信息
//            System.out.println(myvalue);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }

}
