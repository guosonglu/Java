package cn.com.lgs;

public class Demo1 {
    public static void main(String[] args) {
        //数组的初始化
        /*动态初始化*/
        int[] arrayA=new int[3];
        double[] arrayB=new double[4];
        String[] arrayC=new String[3];
        /*静态初始化*/
        int[] arrayD=new int[]{2,5,8};
        String[] arrayE=new String[]{"C","D","E"};
        int[] arrayF={4,5,5};
        /*获得数组中的值*/
        int[] arrayG={1,4,5};
        System.out.println("arrayG内存地址为："+arrayG);  //数组内存地址
        System.out.println("打印arrayG中的元素：");
        System.out.println(arrayG[0]);
        System.out.println(arrayG[1]);
        System.out.println(arrayG[2]);
        /*数组元素赋值*/
        arrayG[1]=6;
    }
}
