package GOIT_Module_8;

class Triangle extends Shape{

    private double sideA;
    private double sideB;
    private double sideC;
    public Triangle(double sideA, double sideB, double sideC){
        this.setName("Triangle");
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calcArea() {
        double p = (sideA + sideB + sideC)/2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    void printShapeParameters() {
        System.out.println(this.getName() + " with next parameters:" );
        System.out.println(" - sideA = " + this.sideA);
        System.out.println(" - sideB = " + this.sideB);
        System.out.println(" - sideC = " + this.sideC);
    }
}



