public class jjjj {

    public static void main(String[] args) {
        hi h = new hi();
        hello h1 = new hello();

        h.start();
        try{Thread.sleep(10);}catch(Exception e){} // here we are put some time duration because we have to put some time between this two statment]
        h1.start();
    }
}

class hi extends Thread{
    public void run() { // here we have to use method name as RUN 
        // for exicution of start method we have to made run method in thread
        int i;

        for (i = 0; i < 5; i++) {
            System.out.println("Hi");
            try{Thread.sleep(500);}catch(Exception e){} // here sleep is stop run procces for 0.5 sec
        }
    }
}

class hello extends Thread{
    public void run() {
        int i;

        for (i = 0; i < 5; i++) {
            System.out.println("hello");
            try{Thread.sleep(500);}catch(Exception e){}
        }
    }
}
