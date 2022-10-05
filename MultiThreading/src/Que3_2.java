class NewWork1{
    public void prints() {
        synchronized(this) {
            for (int i = 0; i < 5; i++) {
                System.out.printf(i + " ");
                try {
                    Thread.sleep(300);
                } catch (Exception e) {
                    return;
                }
            }
        }
    }

}

class Worker2 extends Thread {

    NewWork1 w;
    public Worker2(NewWork1 w){
        this.w=w;
    }
    @Override
    public void run(){
        w.prints();
    }
}



public class Que3_2 {
    public static void main(String[] args) throws InterruptedException {
        NewWork1 w=new NewWork1();
        Worker2 w1=new Worker2(w);
        //System.out.println("Thread 1: "+w1.getName());
        Worker2 w2=new Worker2(w);
        Worker2 w3=new Worker2(w);
        w1.start();
        w2.start();
        w3.start();

    }
}
