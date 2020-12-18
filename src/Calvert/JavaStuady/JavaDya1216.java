public class JavaDya1216 {
    
    // 方法的多级调用
/*     public static void main(String[] args){
        m1();
    }
    public static void m1() {
        System.out.println("m1-start");
        m2();
        System.out.println("m1-end");
    }
    public static void m2() {
        System.out.println("m2-start");
        System.out.println("m2-end");
    } */

    // 递归的思想
 /*    public static void main(String[] args){
        System.out.println(factorial(5));
    }

    public static int factorial(int n) {
        int sum = 1;
        for(int i = 2; i <= n; i++){
            sum *= i ;
        }
        return sum;
    } */

    // 递归
    public static void main(String[] args){
        int result = factorial(5);
        System.out.println(result);
    }

    /* public static int getFive(int n){
        return n * getFour(n-1);
    }
    
    public static int getFour(int n){
        return n * getThree(n-1);
    }

    public static int getThree(int n){
        return n * getTwo(n-1);
    }

    public static int getTwo(int n){
        return n * getOne(n-1);
    }
    
    public static int getOne(int n){
        return 1;
    } */

    // 终极递归
    public static int factorial(int n){
        if(n == 1){
            return 1;
        }
        return n*factorial(n-1);
        
    }
}
