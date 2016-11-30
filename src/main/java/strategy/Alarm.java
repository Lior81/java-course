package strategy;

import java.util.Date;

/**
 * Created by Evegeny on 24/11/2016.
 */
public interface Alarm {
    void stopAlarm();

    void setTime(Date date);
}
