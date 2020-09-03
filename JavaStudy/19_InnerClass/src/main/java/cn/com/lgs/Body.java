package cn.com.lgs;

/**
 * @Author luGuoSong
 * @Date 2020/7/8 17:27
 * @Version 1.0
 */
public class Body {
    int num = 10;

    public class Heart {
        int num = 20;

        public void beat() {
            System.out.println("内部类方法");
        }

        public void showNum() {
            int num = 30;
            System.out.println(num);  //局部变量
            System.out.println(this.num); //成员变量
            System.out.println(Body.this.num);  //外部类变量
        }
    }

    public void method() {
        new Heart().beat();
    }

    //局部内部类
    public void method2() {
        int num =10;
        //num=20;  //局部内部类调用方法局部变量，必须是有效final num改变，局部内部类将无法调用
        class Inner{
            public void methodIn(){
                System.out.println("局部内部类");
                System.out.println(num);  //从java8开始，低版本需要给num强制加上final
            }
        }
        new Inner().methodIn();
    }
}

