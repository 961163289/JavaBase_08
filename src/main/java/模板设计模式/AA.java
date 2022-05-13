package 模板设计模式;

public class AA extends Template {

    //计算任务
    //1+...+800000
    @Override
    public void job() { //实现 Template的抽象方法

        long num = 0;
        for (int i = 1; i <= 800000; i++) {
            num += i;
        }

    }

}
