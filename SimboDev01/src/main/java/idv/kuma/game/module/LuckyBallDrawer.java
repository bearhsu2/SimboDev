package idv.kuma.game.module;

import org.joda.time.DateTime;

public class LuckyBallDrawer {

    public int draw(DateTime dateTime){
        return (dateTime.getHourOfDay() + dateTime.getMinuteOfHour() + dateTime.getSecondOfMinute()) % 10;
    }
}
