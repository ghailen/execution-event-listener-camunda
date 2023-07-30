package org.ghailene.listener;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;

import java.util.Date;
import java.util.logging.Logger;

public class StartProcessEventListener implements ExecutionListener {
    @Override
    public void notify(DelegateExecution delegateExecution) throws Exception {
        System.out.println("Start process Event Listener called begin");
        delegateExecution.setVariable("todayDate",new Date());
        System.out.println("Start process Event Listener called finished");

    }
}
