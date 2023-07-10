package GOIT_Module_8;

class Quad extends Shape{

    private double side;

    public Quad(double side){
        this.setName("Square");
        this.side = side;
    }

    @Override
    public double calcArea() {
        return side * side;
    }

    @Override
    void printShapeParameters() {
        System.out.println(this.getName() + " with next parameter:" );
        System.out.println(" - side = " + this.side);
    }
}
