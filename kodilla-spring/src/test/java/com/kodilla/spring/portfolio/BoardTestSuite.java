package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLOutput;

@SpringBootTest

public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        //When
        Board toDoList = context.getBean(Board.class);
        toDoList.getToDoList().getTasks().add();
        Board inProgressList = context.getBean(Board.class);
        inProgressList.getInProgressList().getTasks();
        Board doneList = context.getBean(Board.class);
        doneList.getDoneList().getTasks();

        //Then
        System.out.println(toDoList);
        System.out.println(inProgressList);
        System.out.println(doneList);

    }
}
