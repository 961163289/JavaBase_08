package 代码块;

public class CodeBlockDetail02 {
    public static void main(String[] args) {
        /**
         * 1) A 静态代码块 01
         * 2) getN1 被调用...
         * 3) A 普通代码块 01
         * 4) getN2 被调用...
         * 5) A() 构造器被调用
         */
        A a = new A();
    }
}

class A {

    //无参构造器
    public A() {
        System.out.println("A() 构造器被调用");
    }

    //普通代码块
    {
        System.out.println("A 普通代码块 01");
    }

    //静态代码块
    static {
        System.out.println("A 静态代码块 01");
    }

    //普通属性的初始化
    private int n2 = getN2();

    //普通方法/非静态方法
    private int getN2() {
        System.out.println("getN2 被调用...");
        return 200;
    }

    //静态属性的初始化
    private static int n1 = getN1();

    //静态方法
    public static int getN1() {
        System.out.println("getN1 被调用...");
        return 100;
    }

}