package cn.com.lgs;

public class Demo1 {
    public static void main(String[] args) {
        int[] array=new int[3]; //动态初始化数组
        System.out.println(array);  //地址值
        System.out.println(array[0]); //0
        System.out.println(array[1]); //0
        System.out.println(array[2]); //0
        System.out.println("===================");
        
        //改变数组当中元素的内容
        array[1]=10;
        array[2]=20;
        System.out.println(array); //地址值
        System.out.println(array[0]); //0
        System.out.println(array[1]); //10
        System.out.println(array[2]); //20
        System.out.println("===================");
        
        int[] arrayB=array;
        System.out.println(arrayB);
        printArray(arrayB);
        System.out.println("===================");
        arrayB[1]=100;
        arrayB[2]=200;
        System.out.println(arrayB);
        printArray(arrayB);
        
        //数组索引越界异常
        //System.out.println(arrayB[5]);
        
        //获得数组的长度
        System.out.println("arrayB长度为："+arrayB.length);
        
        //练习：获得数组元素中的最大值
        System.out.println("获得数组元素中的最大值================");
        int[] arrayC={213,233,234,35,345,23,346,235,325,235};
        int max=arrayC[0];
        for (int i=1;i<arrayC.length;i++){
            if (arrayC[i]>max){
                max=arrayC[i];
            }
        }
        System.out.println("最大值为："+max);
        
        //练习：数组元素反转
        System.out.println("数组元素反转================");
        int[] arrayD={1,2,3,4,5};
        System.out.print("反转前：");
        printArray(arrayD);
        for (int i=0;i<arrayD.length/2;i++){
            int temp=arrayD[arrayD.length-1-i];
            arrayD[arrayD.length-1-i]=arrayD[i];
            arrayD[i]=temp;
        }
        //打印，反转后
        System.out.print("反转后：");
        printArray(arrayD);
    }
    
    //打印数组函数
    public static void printArray(int[] array){
        String res="";
        for (int i=0;i<array.length;i++){
            res=res+array[i]+" ";
        }
        System.out.println(res);
    }
}
