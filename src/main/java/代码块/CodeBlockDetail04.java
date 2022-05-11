package 代码块;

public class CodeBlockDetail04 {
    public static void main(String[] args) {
        /**
         * getVal01()
         * A02 静态代码块...
         * getVal03()
         * B02 静态代码块...
         * A02 普通代码块...
         * getVal02()
         * A02() 构造器...
         * getVal04()
         * B02 普通代码块...
         * B02() 构造器...
         */
        //1) 进行类的加载
        //2) 创建对象
        new B02();

        //new C02();
    }
}

//父类
class A02 {
    private static int n1 = getVal01();

    static{
        System.out.println("A02 静态代码块...");//2
    }

    {
        System.out.println("A02 普通代码块...");//5
    }

    private static int getVal01() {
        System.out.println("getVal01()");//1
        return 10;
    }

    public int n3 = getVal02();

    private int getVal02() {
        System.out.println("getVal02()");//6
        return 10;
    }

    public A02() {
        //隐藏
        //super();
        //普通代码和普通属性的初始化
        System.out.println("A02() 构造器...");//7
    }
}

class B02 extends A02 {

    private static int n3 = getVal03();

    static {
        System.out.println("B02 静态代码块...");//4
    }

    public int n5 = getVal04();

    {
        System.out.println("B02 普通代码块...");//9
    }

    private static int getVal03() {
        System.out.println("getVal03()");//3
        return 10;
    }

    private int getVal04() {
        System.out.println("getVal04()");//8
        return 10;
    }

    public B02() {
        //隐藏
        //super();
        //普通代码和普通属性的初始化
        System.out.println("B02() 构造器...");//10
    }
}

class C02 {
    private int n1 = 100;
    private static int n2 = 200;

    private void m1(){

    }

    private static void m2(){

    }

    static{
        //静态代码块,只能调用静态成员
        //System.out.println(n1); //错误
        System.out.println(n2);
        //m1(); //错误
        m2();
    }

    {
        //普通代码块,可以使用任意成员
        System.out.println(n1);
        System.out.println(n2);
        m1();
        m2();
    }

}






















