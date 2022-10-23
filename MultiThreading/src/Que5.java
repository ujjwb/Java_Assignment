
class Number{
    int number;
    Object lock;
    public Number(){
        this.number=0;
        this.lock=new Object();
    }
    public Number(int number){
        this.number=number;
        this.lock=new Object();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Object getLock() {
        return lock;
    }

    public void setLock(Object lock) {
        this.lock = lock;
    }
}

public class Que5 {
    public static void main(String[] args) {
        Number n1=new Number(25);
        Number n2=new Number(45);

        Thread t1=new Thread(()->{
                    synchronized(n1.getLock()){
                        System.out.println("Lock 1");
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        synchronized(n2.getLock()){
                            System.out.println("Lock 2");
                            int n=n1.getNumber();
                            n1.setNumber(n2.getNumber());
                            n2.setNumber(n);
                            System.out.println();

                        }
                }

        });


        Thread t2=new Thread(()->{
            synchronized(n2.getLock()){
                System.out.println("Lock 2");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized(n1.getLock()){
                    System.out.println("Lock 1");
                    int n=n1.getNumber();
                    n1.setNumber(n2.getNumber());
                    n2.setNumber(n);
                    System.out.println();

                }
            }

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
