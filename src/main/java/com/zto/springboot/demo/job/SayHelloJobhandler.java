package com.zto.springboot.demo.job;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
import org.springframework.stereotype.Component;

@Component
@JobHandler("sayHelloJonHanler")
public class SayHelloJobhandler extends IJobHandler {
    @Override
    public ReturnT<String> execute(String s) throws Exception {
        ReturnT<String> success=  IJobHandler.SUCCESS;
        System.out.println(s);
        return success;
    }
}
