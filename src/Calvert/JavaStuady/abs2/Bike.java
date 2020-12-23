package Calvert.JavaStuady.abs2;

public class Bike extends Vehicle{

    public Bike(){

    }
    public Bike(String brand){
        super(brand);
    }

    @Override
    public void run() {
        System.out.println(super.getBrand()+"牌自行车正在前进");
    }
}
