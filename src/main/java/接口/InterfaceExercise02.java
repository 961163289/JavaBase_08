package 接口;

public class InterfaceExercise02 {
    public static void main(String[] args) {

    }
}

interface AA {
    //想到 等价 public static final int x = 0;
    int x = 0;
}

class BB {
    //普通属性
    int x = 1;
}

class CC extends BB implements AA {
    public void pX() {
        //System.out.println(x);//错误,原因: 不明确 x
        //可以明确的指定 x
        //访问接口的 x 就使用 A.x
        //访问父类的 x 就使用 super.x
        System.out.println(AA.x + " " + super.x);
    }

    public static void main(String[] args) {
        new CC().pX();
    }
}
