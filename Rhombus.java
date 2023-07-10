package GOIT_Module_8;

class Rhombus extends Shape{

    private double diagonal1;
    private double diagonal2;
    public Rhombus(double diagonal1, double diagonal2) {
        this.setName("Rhombus");
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    @Override
    public double calcArea() {
        return diagonal1 * diagonal2 / 2;
    }

    @Override
    void printShapeParameters() {
        System.out.println(this.getName() + " with next parameters:" );
        System.out.println(" - diagonal1 = " + this.diagonal1);
        System.out.println(" - diagonal2 = " + this.diagonal2);
    }
}
