package GOIT_Module_8;

class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        this.setName("Circle");
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    void printShapeParameters() {
        System.out.println(this.getName() + " with next parameter:" );
        System.out.println(" - radius = " + radius);
    }
}
