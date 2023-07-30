package org.ghailene.listener;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;

import java.util.Date;

public class EndTaskEventListener implements ExecutionListener {
    @Override
    public void notify(DelegateExecution delegateExecution) throws Exception {


        System.out.println("end task Event Listener called begin");
        delegateExecution.setVariable("todayDateFromEvent",new Date());
        System.out.println("end task Event Listener called finished");


    }
}
