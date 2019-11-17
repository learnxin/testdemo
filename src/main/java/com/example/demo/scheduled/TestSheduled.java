package com.example.demo.scheduled;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Author: wangran
 * @Description: ${description}
 * @Date: 2019/6/10 10:07
 */
@Slf4j
@Component
public class TestSheduled {

//    @Scheduled(cron = "0 21 10 * * ?")
//    @Scheduled(cron = "0/5 * * * * ?")
//    @Scheduled(cron = "0 0 */6 * * ?")
    @Scheduled(cron = "0 */1 * * * ?")
    public void getSysOrgsByPOuCodeNew() {
        log.info("定时任务执行了");
        System.out.println("tset");
    }

}
