package idv.kuma.game.module;

import idv.kuma.game.vo.User;
import org.joda.time.DateTime;

public class DiceModule extends BaseModule {
    public DiceModule(User user) {
        super(user);

        rtp = 0.98;
    }

    @Override
    public void doLuckyBall(double bet) {


        checkUser();
        checkBet(bet);
        checkBalance(bet);

        DateTime dateTime = DateTime.now();

        // new LuckyBallDrawer
        LuckyBallDrawer drawer = new LuckyBallDrawer();

        // get result
        int drawResult = drawer.draw(dateTime.getDayOfMonth(), dateTime.getHourOfDay(), dateTime.getMinuteOfHour(), dateTime.getSecondOfMinute());

        double returnAmount = calculateReturnAmount(bet, drawResult);

        double newBalance = user.getBalance() - bet + returnAmount;
        user.setBalance(newBalance);

    }

    private double calculateReturnAmount(double bet, double drawResult) {
        return drawResult >= 5 ? bet * 2 : 0;
    }


}
