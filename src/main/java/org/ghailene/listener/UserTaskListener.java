package org.ghailene.listener;

import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.TaskListener;
import org.camunda.bpm.model.bpmn.instance.UserTask;

public class UserTaskListener implements TaskListener {
    @Override
    public void notify(DelegateTask delegateTask) {

        System.out.println("Event name"+delegateTask.getEventName());
        System.out.println("Variables name"+delegateTask.getVariables());
        UserTask userTask = delegateTask.getBpmnModelElementInstance();
        System.out.println("Task name"+userTask.getName());

    }
}
