package que3;
public class Main {
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("New Thread: "+Thread.currentThread().getId());
        }).start();

        System.out.println("Main Thread: "+Thread.currentThread().getId());
    }
}
