package com.kodilla.testing.shape;
import org.junit.jupiter.api.*;
public class ShapeCollectorTestSuit { private static int testCounter = 0;
    @BeforeAll
    public static void beforeAllTests() {
        System.out.println(" Start of test");
    }
    @AfterAll
    public static void afterAllTests() {System.out.println(" All test is done");
    }
    @BeforeEach
    public void beforeEveryTest() {
        testCounter ++;
        System.out.println(" Ready to made a test nr  " + testCounter);}
    @Nested
    @DisplayName(" Test Add Figure")
    class figur{
    @Test
        void testAddFigure() {
            //Given
            ShapeCollector dShapeCollector = new ShapeCollector();
        dShapeCollector.addFigure(new Circle(1));
        // When
        dShapeCollector.addFigure( "circle", "this is firt shape");
        //Then
        Assertions.assertEquals(dShapeCollector.getFigure(2),dShapeCollector.getFigure(1));
        }

    }

}

