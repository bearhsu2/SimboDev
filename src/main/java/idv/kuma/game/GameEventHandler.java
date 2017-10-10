package idv.kuma.game;


import com.google.gson.Gson;
import idv.kuma.game.exception.GamePlayRuntimeException;
import idv.kuma.game.module.LuckyBallDrawer;
import idv.kuma.game.module.Module;
import idv.kuma.game.vo.Parameters;
import idv.kuma.game.vo.User;
import org.joda.time.DateTime;

public class GameEventHandler {

    public Response handleClientRequest(User user, String paramStr) {

        Gson gson = new Gson();
        Parameters parameters = gson.fromJson(paramStr, Parameters.class);

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
                    throw new GamePlayRuntimeException(5);
            }

            // Gson newGson = new Gson();
            return new Response(0, "balance: " + user.getBalance());
        } catch (Exception e) {

            if (e instanceof GamePlayRuntimeException) {
                return new Response(((GamePlayRuntimeException) e).getErrorCode(), "Internal Error");
            } else {
                return new Response(9999, "Unknown Error");
            }

        }

    }

}
