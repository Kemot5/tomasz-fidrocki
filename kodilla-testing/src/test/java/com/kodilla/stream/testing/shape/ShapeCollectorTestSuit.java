package com.kodilla.stream.testing.shape;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNull;

public class ShapeCollectorTestSuit {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println(" Start of test");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println(" All test is done");

    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println(" Ready to made a test nr  " + testCounter);
        System.out.println();
    }

    @Nested
    @DisplayName(" Test Add Figure")
    class TestADD {
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle(2);
            Triangle triangle = new Triangle(2);
            Squared squared = new Squared(3);

            List<Object> nowa = new ArrayList<>();
            nowa.add(circle);
            nowa.add(triangle);
            nowa.add(squared);

            //When
            int result = nowa.size();
            //Then
            Assertions.assertEquals(3, result);

        }
    }

    @Nested
    @DisplayName(" Test remove Figure")
    class TestRemove {
        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle(1);
            shapeCollector.addFigure(circle);
            Triangle triangle = new Triangle(2);
            shapeCollector.addFigure(triangle);
            Squared squared = new Squared(3);

            //When
            boolean result = shapeCollector.removeFigure(triangle);
            //Then
            Assertions.assertEquals(true, result);

        }
    }

    @Nested
    @DisplayName(" Test Show Figure")
    class testShow {
        @Test
        void testshowFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Squared(7);
            Shape shape1 = new Triangle(8);
            Shape shape2 = new Circle(11);
            shapeCollector.addFigure(shape);
            shapeCollector.addFigure(shape1);
            shapeCollector.addFigure(shape2);
            List<Shape> shapeList = new ArrayList<>();
            shapeList.add(shape);
            shapeList.add(shape1);
            shapeList.add(shape2);

//When
            List<Shape> resultList = shapeCollector.getShapeCollector();

//Then
            Assertions.assertEquals(shapeList.toString(), resultList.toString());
        }
    }
    @Test
    void testGetFigureNotExisting() {
//Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Circle(4);

//When
        Shape result = shapeCollector.getFigure(0);

//Then
        assertNull(result);
    }
}






