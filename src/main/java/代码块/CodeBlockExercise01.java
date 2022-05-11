package 代码块;

public class CodeBlockExercise01 {
    public static void main(String[] args) {
        /**
         * in static block!
         * total = 100
         */
        System.out.println("total = "+Person.total);
    }
}

class Person{

    //静态变量
    public static int total;

    //静态代码块
    static {
        total = 100;
        System.out.println("in static block!");
    }

}
