package multi_threading;

// isAlive is check ypur thread is running in main thread or not running
// if it is running than it give true value
// join is uesed to join sub thread to main thread 
// for join we have to check exception 
//getPriority = 1 means least priority and 10 means most priority
//default priority is 5 which is normal priority

public class Alive_join {
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
        });
        // new thread (ruunable object, name)
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
        },"ghar ja be");
        t1.setName("bol be");
        System.out.println(t1.getName());// for first thread default name =0
        System.out.println(t2.getName());//for second thread default name =1
        System.out.println(t1.getId());
        t1.setPriority(1);//min priority
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());



        /*
        t1.start();
        try {
            Thread.sleep(10);
        } catch (Exception e) {
        }
        t2.start();
        System.out.println(t1.isAlive()); // we have to writein println t oshow output

        t1.join();
        t2.join();

        System.out.println(t1.isAlive());
        System.out.println("close");
        */


    }
}
