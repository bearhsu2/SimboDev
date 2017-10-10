package idv.kuma.game.module;

import idv.kuma.game.exception.GamePlayRuntimeException;
import idv.kuma.game.vo.User;

public class PokerModule extends BaseModule {
    public PokerModule(User user) {
        super(user);

        rtp = 0.96;
    }


    @Override
    public void doLuckyBall(double bet) {
        // Unsupported operation: POKER game doesn't support "LUCKY-BALL"
        throw new GamePlayRuntimeException(3);
    }
}
