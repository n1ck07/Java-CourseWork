package itschool.classes;

import java.util.TimerTask;

public class ClockGenerator extends TimerTask {
    public static int getTime() {
        return time;
    }

    public static void incTime(int tact){
        time += time;
    }

    public static void incTime(){
        time++;
    }

    private static int time;

    @Override
    public void run(){
        while (true){
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            incTime();
            System.out.println(time);
        }
    }

}
