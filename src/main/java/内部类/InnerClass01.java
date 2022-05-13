package 内部类;

//外部其它类
public class InnerClass01 {
    public static void main(String[] args) {

    }
}

//外部类
class Outer {
    //属性
    private int n1 = 100;

    //构造器
    public Outer(int n1){
        this.n1 = n1;
    }

    //方法
    public void m1() {
        System.out.println("m1()");
    }

    //代码块
    {
        System.out.println("代码块...");
    }

    //内部类,在Outer类的内部
    class Inner {

    }

}
