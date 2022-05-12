package 抽象类;

public class AbstractDetail01 {
    public static void main(String[] args) {
        //抽象类,不能被实例化
        //new A();
    }
}

//抽象类不一定包含 abstract方法, 也就是说,抽象类可以没有 abstract方法,还可以有实现的方法
abstract class A {
    public void hi() {
        System.out.println("hi");
    }
}

//一但类包含了 abstract方法,则这个类必须声明为 abstract
abstract class B {
    public abstract void hi();
}

//abstract 只能修饰类和方法,不能修饰属性和其他的
abstract class C {
    //public abstract int n1 = 1;
}