package main方法;

public class Main01 {

    //静态的变量/属性
    private static String name = "zi.peng";
    //非静态的变量/属性
    private int n1 = 10000;

    //静态方法
    public static void hi() {
        System.out.println("Main01 的 hi方法(静态)");
    }

    //非静态方法
    public void cry() {
        System.out.println("Main01 的 cry方法(非静态)");
    }

    public static void main(String[] args) {

        //1. 静态方法 main 可以访问本类的静态成员
        //可以直接使用 name
        System.out.println("name = " + name);
        hi();

        //2. 静态方法 main 不可以访问本类的非静态成员
//        System.out.println("n1 = " + n1);//错误
//        cry();

        //3. 静态方法 main 要访问本类的非静态成员,需要先创建对象,再调用即可
        Main01 main01 = new Main01();
        System.out.println("n1 = " + main01.n1);
        main01.cry();


    }

}






















