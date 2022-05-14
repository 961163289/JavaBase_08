package 类变量和类方法;

public class StaticExercise03 {
}

class Student {
    private int id;
    static int total = 0;

    public static void setTotalStudent(int total) {
        //this.total = total; //错误,因为在static方法中,不可以使用this关键字
        Student.total = total;
    }

    public Student() {
        total++;
        id = total;
    }
}

class TestStudent {
    public static void main(String[] args) {
        Student.setTotalStudent(3);
        new Student();
        System.out.println(Student.total);//最后 total 的值就是 4
    }
}

/**
 * 小结:
 * 1) 静态方法,只能访问静态成员
 * 2) 非静态方法可以访问所有成员
 * 3) 在编写代码时,仍然要遵守访问权限规则
 */
