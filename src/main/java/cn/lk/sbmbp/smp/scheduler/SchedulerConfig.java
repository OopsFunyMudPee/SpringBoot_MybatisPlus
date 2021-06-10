package cn.lk.sbmbp.smp.scheduler;


import cn.lk.sbmbp.smp.mappers.UserMapper;
import cn.lk.sbmbp.smp.po.User;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author 6k2
 * @email <a href="mailto:laukaye@qq.com">Email To</a>
 * @date 2021/4/14
 * @desc IntelliJ IDEA: IntelliJ IDEA
 */
@Component
public class SchedulerConfig {

    private final Logger logger = Logger.getLogger(this.getClass());

    //#定时任务设置时间-------- "秒 分 时 ? * ?" [秒] [分] [小时] [日] [月] [周] [年]
    //#   秒 分 时 ? * ?
    //每隔5秒执行一次 */20 * * * * ?

    @Autowired
    private UserMapper userMapper;

    @Scheduled(cron = "${localConfig.scheduler.fileuploadtime}")
    private void fileUploadTime() {
        try {

            User user = new User();
            user.setName(System.currentTimeMillis() % 10000 + "");
            System.out.println(user);
            userMapper.insert(user);

        } catch (Exception e) {
            logger.error("错误原因{}", e);
        }
    }

}
