package strategy;

import java.util.Date;

/**
 * Created by Evegeny on 24/11/2016.
 */
public class RussianAlarm implements Alarm {
    @Override
    public void stopAlarm() {
        System.out.println("Bubuh!!!");
    }

    @Override
    public void setTime(Date date) {
        //238127398hkjfsdfljksdalfa
    }
}
