package idv.kuma.game;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import idv.kuma.game.code.ReturnCode;
import idv.kuma.game.exception.GamePlayRuntimeException;
import idv.kuma.game.module.Module;
import idv.kuma.game.vo.Parameters;
import idv.kuma.game.vo.User;

public class GameEventHandler {

    private final static Gson GSON = new GsonBuilder().create();

    public Response handleClientRequest(User user, String paramStr) {

        Parameters parameters = GSON.fromJson(paramStr, Parameters.class);

        String action = parameters.getAction();
        double bet = parameters.getBet();

        Module module = user.getModule();

        try {
            switch (action) {
                case "INIT": {
                    module.doInit();
                }
                break;
                case "SPIN": {
                    module.doSpin(bet);
                }
                break;
                case "LUCKY-BALL": {
                    module.doLuckyBall(bet);
                }
                break;
                default:
                    // unknown action
                    throw new GamePlayRuntimeException(ReturnCode.UNKNOWN_ACTION);
            }
            return new Response(ReturnCode.OK.getValue(), "balance: " + user.getBalance());
        } catch (Exception e) {
            return handleException(e);
        }

    }

    private Response handleException(Exception e) {
        if (e instanceof GamePlayRuntimeException)
            return new Response(((GamePlayRuntimeException) e).getReturnCode().getValue(), "Internal Error");

        return new Response(ReturnCode.UNKNOWN_ERROR.getValue(), "Unknown Error");

    }

}
