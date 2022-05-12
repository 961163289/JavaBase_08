package final关键字;

public class FinalExercise01 {
    public static void main(String[] args) {

        Cycle cycle = new Cycle(5.0);
        System.out.println("面积 = " + cycle.calArea());

    }
}

class Cycle {
    private double redius;
    private final double PI;//=3.14

    public Cycle(double redius) {
        this.redius = redius;
        //PI = 3.14;
    }

    {
        PI = 3.14;
    }

    public double calArea() {
        return PI * redius * redius;
    }

    public int addOne(final int x) {
        //++x; //错误,原因是不能修改 final x 的值
        return x + 1;//这里是可以
    }
}
