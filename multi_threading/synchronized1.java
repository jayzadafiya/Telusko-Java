//package multi_threading;

public class synchronized1 {
    public static void main(String[] args) throws Exception {

        increment c= new increment();

        Thread t1 = new Thread(new Runnable() {
            public void run(){
                for(int i = 0 ; i<1000; i++)
                {
                    c.counter();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run(){
                for(int i = 0 ; i<1000; i++)
                {
                    c.counter();
                }
            }
        });

        t1.start();
        /*try {   // if we use sleep then we have not use sychhronized method
            Thread.sleep(1);
        } catch (Exception e) {
        }*/
        t2.start();
        t1.join();
        t2.join();

        System.out.println("count ="+c.count);



    }
}

class increment{
    int count;
    public synchronized void counter(){
     count++;

    }
}