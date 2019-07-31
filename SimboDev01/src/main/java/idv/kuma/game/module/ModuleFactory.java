package idv.kuma.game.module;

import idv.kuma.game.vo.User;

public class ModuleFactory {
    public static Module create(String gameType, User user) {
        switch (gameType) {

            case "DICE":
                return new DiceModule(user);
            case "POKER":
                return new PokerModule(user);
            default:
                return null;

        }
    }
}
