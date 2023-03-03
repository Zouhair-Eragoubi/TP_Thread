public class Main {
    public static void main(String[] args) {
        Thread thread1  = new Thread(new Runnable() {
            @Override
            public void run() {
                 new Talkative(1).run();
            }
        });
        Thread thread2  = new Thread(new Runnable() {
            @Override
            public void run() {
                new Talkative(2).run();
            }
        });
        Thread thread3  = new Thread(new Runnable() {
            @Override
            public void run() {
                new Talkative(3).run();
            }
        });
        Thread thread4  = new Thread(new Runnable() {
            @Override
            public void run() {
                new Talkative(4).run();
            }
        });
        Thread thread5  = new Thread(new Runnable() {
            @Override
            public void run() {
                new Talkative(5).run();
            }
        });
        Thread thread6  = new Thread(new Runnable() {
            @Override
            public void run() {
                new Talkative(6).run();
            }
        });
        Thread thread7  = new Thread(new Runnable() {
            @Override
            public void run() {
                new Talkative(7).run();
            }
        });
        Thread thread8  = new Thread(new Runnable() {
            @Override
            public void run() {
                new Talkative(8).run();
            }
        });
        Thread thread9  = new Thread(new Runnable() {
            @Override
            public void run() {
                new Talkative(9).run();
            }
        });
        Thread thread10 = new Thread(new Runnable() {
            @Override
            public void run() {
                new Talkative(10).run();
            }
        });

        thread1.setPriority(1);
        thread2.setPriority(2);
        thread3.setPriority(3);
        thread4.setPriority(4);
        thread5.setPriority(5);
        thread6.setPriority(6);
        thread7.setPriority(7);
        thread8.setPriority(8);
        thread9.setPriority(9);
        thread10.setPriority(10);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();
    }
}