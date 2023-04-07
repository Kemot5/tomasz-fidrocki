package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("inProgressList")

    TaskList toDoList;
    @Autowired
    TaskList inProgressList;
    @Autowired
    TaskList doneList;
    @Bean
    public Board getTaskList() {
        return new Board(toDoList, inProgressList, doneList);
    }

    @Bean(name = "toDoList")
    public TaskList getToDoList() {
        return  new TaskList();
    }
    @Bean(name = "inProgressList")
    public  TaskList getInProgessList() {
        return new TaskList();
    }
@Bean(name = "doneList")
public TaskList getDoneList() {
    return new TaskList();
}




}
