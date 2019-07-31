package idv.kuma.game.module;

import idv.kuma.game.vo.User;
import org.joda.time.DateTime;

public class DiceModule extends BaseModule {

    private LuckyBallDrawer drawer;

    public DiceModule(User user) {
        super(user);

        rtp = 0.98;
        drawer = new LuckyBallDrawer();
    }

    @Override
    public void doLuckyBall(double bet) {
        checkUser();
        checkBet(bet);
        checkBalance(bet);

        double returnAmount = calculateReturnAmount(bet);

        double newBalance = user.getBalance() - bet + returnAmount;
        user.setBalance(newBalance);
    }

    private double calculateReturnAmount(double bet) {
        return drawer.draw(DateTime.now()) >= 5 ? bet * 2 : 0;
    }


}
