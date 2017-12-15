package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;
    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure(){
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(2.0);

        shapeCollector.addFigure(shape);
        
        Assert.assertEquals(1, shapeCollector.getShapesQuantity());

    }

    @Test
    public void testGetFigure(){
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(2.0);
        shapeCollector.addFigure(shape);

        Shape retrievedShape = shapeCollector.getFigure(0);

        Assert.assertEquals(shape, retrievedShape);
    }

    @Test
    public void testRemoveFigureNotExisting(){
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(2.0);

        boolean result = shapeCollector.removeFigure(shape);

        Assert.assertFalse(result);
    }

    @Test
    public void testRemoveFigure(){
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(2.0);
        shapeCollector.addFigure(shape);

        boolean result = shapeCollector.removeFigure(shape);

        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.getShapesQuantity());
    }


}
