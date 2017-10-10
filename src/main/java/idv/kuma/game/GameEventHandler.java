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

        int returnCode;

        Module module = user.getModule();

        try {
            switch (action) {
                case "INIT": {
                    module.doInit();
                }
                break;
                case "SPIN": {

                    if (parameters.getBet() > 0) {
                        if ("DICE".equals(user.getGameType())) {

                            if (!user.isInitialized()) {
                                throw new GamePlayRuntimeException(1);
                            } else if (user.getBalance() < bet) {
                                throw new GamePlayRuntimeException(2);
                            } else {
                                // play dice spin: RTP 98%
                                double oldBalance = user.getBalance();
                                double returnAmount = 98D / 100D * bet;
                                double newBalance = user.getBalance() - bet + returnAmount;
                                user.setBalance(newBalance);
                            }

                        } else {

                            if (!user.isInitialized()) {
                                throw new GamePlayRuntimeException(1);
                            } else if (user.getBalance() < bet) {
                                throw new GamePlayRuntimeException(2);
                            } else {
                                // play poker: RTP 96%
                                double oldBalance = user.getBalance();
//                        double newBalance = bet * 96 / 100;
                                double returnAmount = 96D / 100D * bet;
                                double newBalance = user.getBalance() - bet + returnAmount;
                                user.setBalance(newBalance);
                            }
                        }
                    } else {
                        throw new GamePlayRuntimeException(4);
                    }
                }
                break;
                case "LUCKY-BALL": {
                    if ("DICE".equals(user.getGameType())) {

                        // check if bet > 0
                        if (parameters.getBet() > 0) {

                            if (!user.isInitialized()) {
                                throw new GamePlayRuntimeException(1);
                            } else if (user.getBalance() < bet) {
                                throw new GamePlayRuntimeException(2);
                            }


                            DateTime dateTime = DateTime.now();

                            // new LuckyBallDrawer
                            LuckyBallDrawer drawer = new LuckyBallDrawer();

                            // get result
                            int result = drawer.draw(dateTime.getDayOfMonth(), dateTime.getHourOfDay(), dateTime.getMinuteOfHour(), dateTime.getSecondOfMinute());

                            double returnAmount = 0;
                            if (result >= 5) {
                                returnAmount = bet * 2;
                            }

// [2017-10-05] mart this part. because the game logic changed
//                            if (!user.isInitialized()) {
//                                throw new GamePlayRuntimeException(1);
//                            } else if (user.getBalance() < bet) {
//                                throw new GamePlayRuntimeException(2);
//                            } else {
//                                // play dice super-spin: RTP 98%
//                                double oldBalance = user.getBalance();
//                                double returnAmount = 98 / 100 * bet;
//                                double newBalance = user.getBalance() - bet + returnAmount;
//                                user.setBalance(newBalance);
//                            }


                            // play dice spin: RTP 98%
                            double oldBalance = user.getBalance();
                            double newBalance = user.getBalance() - bet + returnAmount;
                            user.setBalance(newBalance);

                        } else {
                            throw new GamePlayRuntimeException(4);
                        }

                    } else {

                        // Unsupported operation: POKER game doesn't support "LUCKY-BALL"
                        throw new GamePlayRuntimeException(3);
//
//                        if (!user.isInitialized()) {
//                            throw new GamePlayRuntimeException(1);
//                        } else if (user.getBalance() < bet){
//                            throw new GamePlayRuntimeException(2);
//                        } else {
//                            // play poker: RTP 96%
//                            double oldBalance = user.getBalance();
////                        double newBalance = bet * 96 / 100;
//                            double returnAmount = 96 / 100 * bet;
//                            double newBalance = user.getBalance() - bet + returnAmount;
//                            user.setBalance(newBalance);
//                        }
                    }


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
