package strategy;

import java.util.Date;

/**
 * Created by Evegeny on 24/11/2016.
 */
public class RadioAlarm implements Radio, Alarm {
    private Radio radio = new RadioImpl();
    private Alarm alarm = new RussianAlarm();

    @Override
    public void setChannel(long channel) {
        radio.setChannel(channel);
    }

    @Override
    public void setVolume(int volume) {
        radio.setVolume(volume);
    }

    @Override
    public void stopAlarm() {
        alarm.stopAlarm();

    }

    @Override
    public void setTime(Date date) {
        alarm.setTime(date);
    }
}
