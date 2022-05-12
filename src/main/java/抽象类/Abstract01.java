package 抽象类;

public class Abstract01 {
    public static void main(String[] args) {

    }
}

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    //思考: 这里 eat这里你实现了,其实没有什么意义
    //即: 父类方法不确定性的问题
    //1. 考虑将该方法设计为抽象(abstract)方法
    //2. 所谓抽象方法就是没有实现的方法
    //3. 所谓没有实现就是指,没有方法体
    //4. 当一个类中存在抽象方法时,需要将该类声明为 abstract类
    //5. 一般来说,抽象类会被继承,由其子类来实现抽象方法
//    public void eat(){
//        System.out.println("这是一只动物,但是不知道吃什么...");
//    }

    public abstract void eat();
}
