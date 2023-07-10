package GOIT_Module_8;

public class ShapeTest {

    public static void main(String[] args) {
        Circle circle = new Circle(1);
        circle.printShapeParameters();

        Quad quad = new Quad(1);
        quad.printShapeParameters();

        Rectangle rectangle = new Rectangle(1, 10);
        rectangle.printShapeParameters();

        Rhombus rhombus = new Rhombus(1, 11);
        rhombus.printShapeParameters();

        Triangle triangle = new Triangle(3, 4, 5);
        triangle.printShapeParameters();

        ShapePrinter.printShape(circle);
        System.out.println("and the area is " + circle.calcArea());

        ShapePrinter.printShape(quad);
        System.out.println("and the area is " + quad.calcArea());

        ShapePrinter.printShape(rectangle);
        System.out.println("and the area is " + rectangle.calcArea());

        ShapePrinter.printShape(rhombus);
        System.out.println("and the area is " + rectangle.calcArea());

        ShapePrinter.printShape(triangle);
        System.out.println("and the area is " + triangle.calcArea());

    }
}
