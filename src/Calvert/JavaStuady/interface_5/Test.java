package Calvert.JavaStuady.interface_5;

public class Test {
    public static void main(String[] args) {
        Computer lenovo = new Computer();
        Usb mouse = new Mouse();
        Usb fan = new Fan();
        Usb dd = new Upan();

        lenovo.usb1 = fan;
        lenovo.usb2 = dd;
        lenovo.usb3 = mouse;
        lenovo.run();
    }
}
