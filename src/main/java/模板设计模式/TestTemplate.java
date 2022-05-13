package 模板设计模式;

public class TestTemplate {
    public static void main(String[] args) {

        //这里还是需要有良好的 OOP 基础，对多态
        AA aa = new AA();
        aa.calculateTime();

        BB bb = new BB();
        bb.calculateTime();

    }
}
