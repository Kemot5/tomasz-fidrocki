package com.kodilla.testing.shape;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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
            Circle circle = new Circle(1);
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
            boolean result = shapeCollector.removeFigure(circle);
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
            Circle circle = new Circle(1);
            shapeCollector.addFigure(circle);
            Triangle triangle = new Triangle(2);
            shapeCollector.addFigure(triangle);
            Squared squared = new Squared(3);


            //When
            Shape result = shapeCollector.showFigure();
            //Then
            Assertions.assertEquals(null, result);
        }


}
}





