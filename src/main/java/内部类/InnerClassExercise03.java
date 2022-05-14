package 内部类;

//外部类
public class InnerClassExercise03 {

    //构造器
    public InnerClassExercise03() {
        Inner s1 = new Inner();
        s1.a = 10;
        Inner s2 = new Inner();
        System.out.println(s2.a);
    }

    //内部类,成员内部类
    class Inner {
        public int a = 5;
    }

    public static void main(String[] args) {
        InnerClassExercise03 t = new InnerClassExercise03();//5
        Inner r = t.new Inner();
        System.out.println(r.a);//5
    }
}
