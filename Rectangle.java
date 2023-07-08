package GOIT_Module_8;

class Rectangle extends Shape{

    private double sideA;
    private double sideB;
    public Rectangle(double sideA, double sideB){
        this.setName("Rectangle");
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calcSquare() {
        return sideA * sideB;
    }
}
