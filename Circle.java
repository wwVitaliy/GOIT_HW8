package GOIT_Module_8;

class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        this.setName("Circle");
        this.radius = radius;
    }

    @Override
    public double calcSquare() {
        return Math.PI * this.radius * this.radius;
    }
}
