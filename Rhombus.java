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
    public double calcSquare() {
        return diagonal1 * diagonal2 / 2;
    }
}
