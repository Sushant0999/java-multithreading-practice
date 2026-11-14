public class Print_Odd_And_Even {

    public static void main(String[] args) {
        Odd odd = new Odd();
        Even even = new Even();

        Thread t1 = new Thread(odd);
        Thread t2 = new Thread(even);

        t1.start();
        t2.start();
    }

}

class Odd implements Runnable {
    @Override
    public void run() {
        for(int i = 1; i <= 10; i++){
            if(i % 2 != 0){
                System.out.println("ODD Thread : " + i);
            }
        }
    }

}

class Even implements Runnable {
    @Override
    public void run() {
        for(int i = 1; i <= 10; i++){
            if(i % 2 == 0){
                System.out.println("EVEN Thread : " + i);
            }
        }
    }

}