//package multi_threading;

// using class we cannotachive mutipual inheritance that why we use interface 
//here runnable is functionalinterface
// in interface we use implements runnable as extends thread

public class Runnable_thread {
    public static void main(String[] args) {

        Runnable h = new hi(); // here we can use runnable because thread hi is now in runnable class
        Runnable h1 = new hello(); // here we made runnable object using thread class

        Runnable h3 = new Runnable() {
            public void run() {
                int i;

                for (i = 0; i < 5; i++) {
                    System.out.println("Annoymus class");
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                    }
                }
            }
        };
        Runnable h4 = () -> {
            int i;

            for (i = 0; i < 5; i++) {
                System.out.println("Runnable lambda expression");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }

            }
        };

        Thread t1 = new Thread(h); // here in new thread we have to give aa runnable object
        Thread t2 = new Thread(h1);
        Thread t3 = new Thread(h3);
        Thread t4 = new Thread(h4);

        // here we are made thread using runnable objects thats why we are writeing
        // lambda exprection in ()
        Thread t5 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Lambda expression");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
        });

        t1.start(); // while working with threads always call start and it is automatically cal run
                    // method 
        try {
            Thread.sleep(10);
        } catch (Exception e) {
        }

        t2.start();
        try {
            Thread.sleep(10);
        } catch (Exception e) {
        }

        t3.start();
        try {
            Thread.sleep(10);
        } catch (Exception e) {
        }

        t4.start();
        try {
            Thread.sleep(10);
        } catch (Exception e) {
        }

        t5.start();

    }
}

class hi implements Runnable {
    public void run() {
        int i;

        for (i = 0; i < 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            } // here sleep is stop run procces for 0.5 sec
        }
    }
}

class hello implements Runnable {
    public void run() {
        int i;

        for (i = 0; i < 5; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}
