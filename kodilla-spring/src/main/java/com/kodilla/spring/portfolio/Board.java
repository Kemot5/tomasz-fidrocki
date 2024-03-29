package com.kodilla.spring.portfolio;

import com.kodilla.stream.portfolio.TaskList;
import org.springframework.scheduling.config.Task;

public  class Board {
     TaskList toDoList;
     TaskList inProgressList;
     TaskList doneList;


     public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
          this.toDoList = toDoList;
          this.inProgressList = inProgressList;
          this.doneList = doneList;
     }

     public Board(com.kodilla.spring.portfolio.TaskList toDoList, com.kodilla.spring.portfolio.TaskList inProgressList, com.kodilla.spring.portfolio.TaskList doneList) {
     }


     public TaskList getToDoList() {
          return toDoList;
     }

     public TaskList getInProgressList() {
          return inProgressList;
     }

     public TaskList getDoneList() {
          return doneList;
     }

     @Override
     public String toString() {
          return "Board{" +
                  "toDoList=" + toDoList +
                  ", inProgressList=" + inProgressList +
                  ", doneList=" + doneList +
                  '}';
     }
}
