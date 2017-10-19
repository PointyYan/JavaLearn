package example.Thread;

public class main{

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + "主线程运行开始！");
        NTJoin ntJoin1 = new NTJoin("A");
        NTJoin ntJoin2 = new NTJoin("B");

        ntJoin1.start();
        ntJoin2.start();

        System.out.println(Thread.currentThread().getName() + "主线程运行结束！");

    }
}
