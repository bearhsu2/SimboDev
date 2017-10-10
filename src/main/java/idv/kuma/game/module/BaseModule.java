package idv.kuma.game.module;

import idv.kuma.game.exception.GamePlayRuntimeException;
import idv.kuma.game.vo.User;

public abstract class BaseModule implements Module{

    User user;
    double rtp;

    public BaseModule(User user) {
        this.user = user;
    }

    @Override
    public void doInit(){
        if (user.isInitialized()) {
            throw new GamePlayRuntimeException(6);
        } else {
            user.setInitialized(true);
        }
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getRtp() {
        return rtp;
    }

    public void setRtp(double rtp) {
        this.rtp = rtp;
    }
}
