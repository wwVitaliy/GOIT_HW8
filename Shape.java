package GOIT_Module_8;

abstract class Shape implements CalcSquare {

    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void printName (){
        System.out.println(this.name);
    }

}
