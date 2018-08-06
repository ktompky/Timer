import java.util.Timer;
import java.util.TimerTask;

public class timerClass{
    
    int secondsPassed = 0;
    
    Timer myTimer = new Timer();
    TimerTask task = new TimerTask() {
        public void run() {
            secondsPassed++;
            System.out.println("Seconds passed: " + secondsPassed);
        }
    };
    
    public void start() {
        myTimer.scheduleAtFixedRate(task, 10000, 10000);
    }
    

     public static void main(String []args){
        timerClass newTimer = new timerClass();
        newTimer.start();
     }
}
