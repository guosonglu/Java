package cn.com.lgs.ioc;

/**
 * @Author luGuoSong
 * @Date 2020/5/9 10:02
 * @Version 1.0
 * 定义一个方法，把数组{1，2，3}按照指定格式拼接成一个字符串。格式参照如下：[word1#word2#word3]。
 */
public class Demo5 {
    public static void main(String[] args) {
        int[] intArray={1,2,3};
        System.out.println(arrayToString(intArray));
    }

    public static  String arrayToString(int[] array){
        String str="[";
        for (int i = 0; i < array.length; i++) {
            if (i==array.length-1){
                str+="word"+array[i]+"]";
            }else{
                str+="word"+array[i]+"#";
            }
        }
        return str;
    }

}
