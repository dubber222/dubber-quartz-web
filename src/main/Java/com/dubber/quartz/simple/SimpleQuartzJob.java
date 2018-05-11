package com.dubber.quartz.simple;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * Created by dubber on 2018/5/11.
 */
public class SimpleQuartzJob implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("SimpleQuartzJOb  start ing……");
    }
}
