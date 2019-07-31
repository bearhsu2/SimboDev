package idv.kuma.game.exception;

import idv.kuma.game.code.ReturnCode;

public class GamePlayRuntimeException extends RuntimeException {

    ReturnCode returnCode;

    public GamePlayRuntimeException(ReturnCode returnCode) {
        this.returnCode = returnCode;
    }

    public ReturnCode getReturnCode() {
        return returnCode;
    }

}
