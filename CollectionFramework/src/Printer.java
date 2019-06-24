public class Printer extends Thread{



    @Override
    public void run() {
        int i=0;
        while(i < 10000){
            System.out.println(i);
            i++;
        }
    }
}
