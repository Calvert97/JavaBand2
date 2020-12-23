package Calvert.JavaStuady.interface_5;

public class Fan implements Usb{
    @Override
    public void service() {
        System.out.println("风扇开始工作了");
    }
}
