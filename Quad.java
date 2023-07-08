package GOIT_Module_8;

class Quad extends Shape{

    private double side;

    public Quad(double side){
        this.setName("Square");
        this.side = side;
    }

    @Override
    public double calcSquare() {
        return side * side;
    }
}
