package idv.kuma.game.code;

public enum ReturnCode {

    // 6: initialized twice
    // 1: uninitialized play
    // 2: insufficient balance
    // 3: unsupported operation
    // 4: bet not positive
    // 5: unknown action: can only be: "INIT", "SPIN", or "LUCKY-BALL"
    OK(0),
    UNINITIALIZED_PLAY(1),
    INSUFFICIENT_BALANCE(2),
    UNSUPPORTED_OPERATION(3),
    NON_POSITIVE_BET(4),
    UNKNOWN_ACTION(5),
    DUPLICATED_INITIALIZATION(6),
    UNKNOWN_ERROR(9999);

    private int value;

    ReturnCode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }


}



