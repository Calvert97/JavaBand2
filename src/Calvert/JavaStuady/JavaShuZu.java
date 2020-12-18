package Calvert.JavaStuady;

public class JavaShuZu {
    public static void main(String[] args){
        int[] arr = new int[3]; // 动态初始化
        int[] arr2 = new int[4];// 动态初始化

        System.out.println(arr);// [I@16b98e56 内存空间的值
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println(arr2);// [I@16b98e56 内存空间的值
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);

        arr[0]=100;
        arr[2]=200;

        arr2[0]=10;
        arr2[2]=20;

        int[] arr3 = arr2;

        arr3[0]=1000;
        arr3[1]=3000;
        arr3[2]=2000;


        System.out.println(arr);// [I@16b98e56 内存空间的值
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println(arr2);// [I@16b98e56 内存空间的值
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);

        System.out.println(arr3);// [I@16b98e56 内存空间的值
        System.out.println(arr3[0]);
        System.out.println(arr3[1]);
        System.out.println(arr3[2]);

        int[] arr4 = {1,2,3,4,5};
        System.out.println(arr4);
        System.out.println(arr4[0]);
        System.out.println(arr4[3]);
        System.out.println(arr4[2]);

        System.out.println("------------");
    // 数组的遍历
        int[] arr5 = {1,2,3,4,5,6,7,8,9,0};
        for(int x = 0; x<arr5.length; x++){
            System.out.println(arr5[x]);
        }
        System.out.println("------------");
        for (int i : arr5) {
            System.out.println(i);
        }
        // 数组获取最大值
        int[] arr6 = {12,354,54,9,13};
        int max = arr6[0];
        for (int n = 1; n < arr.length; n++){
            if (arr6[n] > max){
                max = arr6[n];
            }
        }
        System.out.println("max"+max);





    }

}
