package watch.model;

import static java.lang.Math.PI;
import java.util.Timer;
import java.util.TimerTask;

public class Watch {
    private double hours;
    private double minutes;
    private double seconds;

    public Watch() {
        this(PI/2,PI/2,PI/2);
    }

    public Watch(double hours, double minutes, double seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        Timer timer = new Timer();
        timer.schedule(task(), 0, 100);
    }

    public double getHours() {
        return hours;
    }

    public double getMinutes() {
        return minutes;
    }

    public double getSeconds() {
        return seconds;
    }



    private TimerTask task() {
        return new TimerTask() {
            private double DegreesPerSecond = 2 * PI / 60;
            private double DegreesPerMinute = DegreesPerSecond / 60;
            private double DegreesPerHour = DegreesPerMinute / 12;
            @Override
            public void run() {
                seconds = normalize(seconds - DegreesPerSecond);
                minutes = normalize(minutes - DegreesPerMinute);
                hours = normalize(hours - DegreesPerHour);
            }

            private double normalize(double angle) {
                return angle < 0 ?  angle + PI * 2 : angle;
            }
        };
    }

    @Override
    public String toString() {
        return "Watch{" + "hours=" + hours + ", minutes=" + minutes + ", seconds=" + seconds + '}';
    }
}
