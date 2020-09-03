package cn.com.lgs;

import java.util.Scanner;

/*Scanner联系-计算输入的三个数的最大值*/
public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.printf("请输入第一个数：");
        int num1=scanner.nextInt();
        int maxNum=num1;
        System.out.printf("请输入第二个值：");
        int num2=scanner.nextInt();
        if (num2>maxNum)
            maxNum=num2;
        System.out.printf("请输入第三个值：");
        int num3=scanner.nextInt();
        if (num3>maxNum)
            maxNum=num3;
        System.out.println("输入的三个数当中，最大值为："+maxNum);

    }
}
