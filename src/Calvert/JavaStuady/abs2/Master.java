package Calvert.JavaStuady.abs2;


public class Master {
    private String name;
    public Master(){

    }
    public Master(String name){
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void goHome(Vehicle vehicle){
        System.out.println(this.name+"要回家了");
        vehicle.run();
    }
}
