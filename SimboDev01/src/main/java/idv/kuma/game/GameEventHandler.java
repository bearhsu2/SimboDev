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

        Module module = user.getModule();
        Parameters parameters = GSON.fromJson(paramStr, Parameters.class);

        try {
            doAction(module, parameters);
            return new Response(ReturnCode.OK.getValue(), composeBalanceMessage(user.getBalance()));
        } catch (GamePlayRuntimeException gpre) {
            return handlePreDefinedRuntimeException(gpre);
        } catch (Exception e) {
            return handleUnknownException(e);
        }

    }

    private String composeBalanceMessage(double balance){
        return "balance: " + balance;
    }

    private void doAction(Module module, Parameters parameters) {

        String action = parameters.getAction();

        switch (action) {
            case "INIT":
                module.doInit();
                break;
            case "SPIN":
                module.doSpin(parameters.getBet());
                break;
            case "LUCKY-BALL":
                module.doLuckyBall(parameters.getBet());
                break;
            default:
                // unknown action
                throw new GamePlayRuntimeException(ReturnCode.UNKNOWN_ACTION);
        }

    }

    private Response handlePreDefinedRuntimeException(GamePlayRuntimeException gpre) {
        return new Response(gpre.getReturnCode().getValue(), "Internal Error");

    }

    private Response handleUnknownException(Exception e) {
        return new Response(ReturnCode.UNKNOWN_ERROR.getValue(), "Unknown Error");
    }

}
