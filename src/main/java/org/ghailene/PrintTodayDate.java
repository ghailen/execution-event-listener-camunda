package org.ghailene;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.Date;


public class PrintTodayDate  implements JavaDelegate {


    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

        System.out.println("PrintTodayDate service task begin");
        delegateExecution.getVariable("todayDate");
        System.out.println("PrintTodayDate service task end");

    }
}
