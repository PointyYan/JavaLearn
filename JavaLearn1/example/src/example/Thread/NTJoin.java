package example.Thread;

public class NTJoin extends Thread {

    private String name;

    public NTJoin(String name) {

        super(name);
        this.name = name ;
    }

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() + "线程开始运行！");
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程" + name + "运行：" + i);
            try {
                sleep((int) Math.random() * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(Thread.currentThread().getName() + "线程运行结束！");

    }
}

