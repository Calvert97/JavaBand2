public class JavaDay1215{
/*     public static void main(String[] args){
        System.out.println("Calvert");
        pringSign(12,'+');
        System.out.println("Calvert");
        pringSign(12,'-');
        System.out.println("Calvert");
    }

// 自定义方法
    public static void pringSign(int count,char sign){
        for (int i=1; i <= count; i++){
            System.out.print(sign);
        }
        System.out.println();
    }
 */
    public static void main(String[] args){
        int result = add(5,10);  

        System.out.println("总和"+result);

        String str = isEven(11);
        System.out.println(str);


        show();

    }

    public static int add(int num1,int num2){
        int sum = num1 + num2;
        return sum;
    }

public static double cal(double a,double b){
    double sum = a + b;
    System.out.println("运算结束");
    return sum;
}

public static String isEven(int num){
    if (num % 2 == 0){
        return "偶数";
    } else {
        return "奇数";
    }
}


public static void show(){

    for(int i = 1; i <= 10; i++ ){
        System.out.println("当前值"+i);
        if(i==7){
            return;
            //break;
        }      
    }
    System.out.println("Calvert...");  
}





}

