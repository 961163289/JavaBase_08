package 接口.Interface02;

//A程序员连接 Mysql
public class MysqlDB implements DBInterface {

    @Override
    public void connect() {
        System.out.println("连接 mysql");
    }

    @Override
    public void close() {
        System.out.println("关闭 mysql");
    }
}