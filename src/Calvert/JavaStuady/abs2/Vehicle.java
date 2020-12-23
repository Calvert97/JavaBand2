package Calvert.JavaStuady.abs2;

public abstract class Vehicle {
    private String brand;
    public Vehicle(){

    }
    public Vehicle(String brand){
        super();
        this.brand = brand;
    }

    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }

    // 前进的方法
    public abstract void run();


}
