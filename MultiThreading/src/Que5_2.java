import java.util.concurrent.locks.ReentrantLock;

public class Que5_2 {
    public static void main(String[] args) {
        Number n1=new Number(25);
        Number n2=new Number(45);
        ReentrantLock lock=new ReentrantLock();
        Thread t1=new Thread(()->{

                lock.lock();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                int n=n1.getNumber();
                n1.setNumber(n2.getNumber());
                n2.setNumber(n);
                System.out.println();
                lock.unlock();
        });


        Thread t2=new Thread(()->{
                lock.lock();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                int n=n1.getNumber();
                n1.setNumber(n2.getNumber());
                n2.setNumber(n);
                System.out.println();
                lock.unlock();
        });

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("done");
    }
}
