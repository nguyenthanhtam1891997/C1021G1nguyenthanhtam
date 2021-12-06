package ss4_Class.bai_tap;

public class StopWatch {
    private long startTime;
    private long endTime;
    private StopWatch(){
       startTime=System.currentTimeMillis();
    }

    private void start(){
        startTime = System.currentTimeMillis();
        System.out.println(startTime);

    }
    private void stop(){
        endTime=System.currentTimeMillis();
        System.out.println("StopWatch: "+getElapsedTime()+" milliseconds.");
    }
    private long  getElapsedTime(){
        return endTime-startTime;
    }

    public static void main(String[] args) {
        StopWatch watch  = new StopWatch();
        watch.start();
       for (int i=0;i<1000000;i++){


       }
        watch.stop();
    }
}
