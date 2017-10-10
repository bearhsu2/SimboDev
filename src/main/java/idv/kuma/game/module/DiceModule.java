package idv.kuma.game.module;

import idv.kuma.game.vo.User;

public class DiceModule extends BaseModule {
    public DiceModule(User user) {
        super(user);

        rtp = 0.98;
    }

    @Override
    public void doLuckyBall() {

    }
}
