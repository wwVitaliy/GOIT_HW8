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
    public double calcArea() {
        return sideA * sideB;
    }

    @Override
    void printShapeParameters() {
        System.out.println(this.getName() + " with next parameters:" );
        System.out.println(" - sideA = " + this.sideA);
        System.out.println(" - sideB = " + this.sideB);
    }
}
