package idv.kuma.game.exception;

public class GamePlayRuntimeException extends RuntimeException {


    // 6: initialized twice
    // 1: uninitialized play
    // 2: insufficient balance
    // 3: unsupported operation
    // 4: bet less than 0
    // 5: unknown action: can only be: "INIT", "SPIN", or "LUCKY-BALL"
    int errorCode;

    public GamePlayRuntimeException(int errorCode) {
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }
}
