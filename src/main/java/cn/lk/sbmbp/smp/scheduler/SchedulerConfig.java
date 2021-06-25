package cn.lk.sbmbp.smp.scheduler;


import cn.lk.sbmbp.smp.mappers.UserMapper;
import cn.lk.sbmbp.smp.po.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author 6k2
 * @email <a href="mailto:laukaye@qq.com">Email To</a>
 * @date 2021/4/14
 * @desc IntelliJ IDEA: IntelliJ IDEA
 */
@Slf4j
@Component
public class SchedulerConfig {

    //#定时任务设置时间-------- "秒 分 时 ? * ?" [秒] [分] [小时] [日] [月] [周] [年]
    //#   秒 分 时 ? * ?
    //每隔5秒执行一次 */20 * * * * ?

    @Resource
    private UserMapper userMapper;

    @Scheduled(cron = "${localConfig.scheduler.fileuploadtime}")
    private void fileUploadTime() {

        User user = new User();
        user.setName(System.currentTimeMillis() % 10000 + "");
        System.out.println(user);
        log.info(user.toString());
//        userMapper.insert(user);

    }

}
