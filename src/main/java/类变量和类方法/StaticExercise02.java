package 类变量和类方法;

public class StaticExercise02 {
}

class Person {
    private int id;
    private static int total = 0;

    public static int getTotalPerson() {
        //id++; //错误
        return total;
    }

    public Person() {
        total++;//total = 1
        id = total;//id = 1
    }
}

class TestPerson {
    public static void main(String[] args) {
        System.out.println("Number of total is " + Person.getTotalPerson());//0
        Person person = new Person();
        System.out.println("Number of total is " + Person.getTotalPerson());//1
    }
}
