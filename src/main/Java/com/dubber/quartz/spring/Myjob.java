package com.dubber.quartz.spring;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * Created by dubber on 2018/5/11.
 */
public class Myjob extends QuartzJobBean {
    private static int count = 1;

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("Myjob开始执行了。。。。" + jobExecutionContext.getTrigger().getKey().getName());
        ApplicationContext applicationContext = (ApplicationContext) jobExecutionContext.getJobDetail().getJobDataMap()
                .get("applicationContext");
        System.out.println("获取到的容器是：" + (count++) + "|" + applicationContext);
    }
}
