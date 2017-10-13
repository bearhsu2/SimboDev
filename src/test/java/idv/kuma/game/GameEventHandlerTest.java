package idv.kuma.game;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import idv.kuma.game.vo.Parameters;
import idv.kuma.game.vo.User;
import org.joda.time.DateTime;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;


@RunWith(PowerMockRunner.class)
@PrepareForTest({ DateTime.class })
public class GameEventHandlerTest {

    final double INIT_BALANCE = 3000D;
    final double POSITIVE_BET = 300D;
    final double VERY_BIG_BET = 999999D;
    final double ZERO_BET = 0D;

    User diceUser;
    User pokerUser;
    GameEventHandler handler;

    final Gson GSON = new GsonBuilder().create();


    @Before
    public void setUp() throws Exception {
        diceUser = new User("DICE", INIT_BALANCE);
        pokerUser = new User("POKER", INIT_BALANCE);
        handler = new GameEventHandler();
    }

    @After
    public void tearDown() throws Exception {
    }


    // Init tests

    @Test
    public void testInitOKDice() throws Exception {
        Response response = runTestInit(diceUser);
        checkResponse(0, generateBalanceString(INIT_BALANCE), response);

    }

    @Test
    public void testInitOKPoker() throws Exception {
        Response response = runTestInit(pokerUser);
        checkResponse(0, generateBalanceString(INIT_BALANCE), response);

    }

    @Test
    public void testInitInitTwiceDice() throws Exception {
        runTestInit(pokerUser);
        Response response = runTestInit(pokerUser);
        checkResponse(6, "Internal Error", response);
    }


    @Test
    public void testInitInitTwicePoker() throws Exception {
        runTestInit(pokerUser);
        Response response = runTestInit(pokerUser);
        checkResponse(6, "Internal Error", response);
    }

    // Spin tests

    @Test
    public void testSpinOKDice() throws Exception {
        runTestInit(diceUser);
        Response response = runTestSpin(diceUser, POSITIVE_BET);
        checkResponse(0, generateBalanceString(2994D), response);
    }

    @Test
    public void testSpinInsufficientBalanceDice() throws Exception {
        runTestInit(diceUser);
        Response response = runTestSpin(diceUser, VERY_BIG_BET);
        checkResponse(2, "Internal Error", response);
    }

    @Test
    public void testSpinNonPositiveBetDice() throws Exception {
        runTestInit(diceUser);
        Response response = runTestSpin(diceUser, ZERO_BET);
        checkResponse(4, "Internal Error", response);

    }

    @Test
    public void testSpinUnInitializedDice() throws Exception {
        Response response = runTestSpin(diceUser, POSITIVE_BET);
        checkResponse(1, "Internal Error", response);

    }

    @Test
    public void testSpinOKPoker() throws Exception {
        runTestInit(pokerUser);
        Response response = runTestSpin(pokerUser, POSITIVE_BET);
        checkResponse(0, generateBalanceString(2988D), response);
    }

    @Test
    public void testSpinInsufficientBalancePoker() throws Exception {
        runTestInit(pokerUser);
        Response response = runTestSpin(pokerUser, VERY_BIG_BET);
        checkResponse(2, "Internal Error", response);
    }

    @Test
    public void testSpinNonPositiveBetPoker() throws Exception {
        runTestInit(pokerUser);
        Response response = runTestSpin(pokerUser, ZERO_BET);
        checkResponse(4, "Internal Error", response);

    }

    @Test
    public void testSpinUninitializedPoker() throws Exception {
        Response response = runTestSpin(pokerUser, POSITIVE_BET);
        checkResponse(1, "Internal Error", response);

    }


    // Lucky ball

    @Test
    public void testLuckyBallOKPlayerWinDice() throws Exception {
        mockDateTime(6);
        runTestInit(diceUser);
        Response response = runTestLuckyBall(diceUser, POSITIVE_BET);
        checkResponse(0, generateBalanceString(3300D), response);
    }

    @Test
    public void testLuckyBallOKComputerWinDice() throws Exception {
        mockDateTime(3);
        runTestInit(diceUser);
        Response response = runTestLuckyBall(diceUser, POSITIVE_BET);
        checkResponse(0, generateBalanceString(2700D), response);
    }

    @Test
    public void testLuckyBallUninitializedDice() throws Exception {
        Response response = runTestLuckyBall(diceUser, POSITIVE_BET);
        checkResponse(1, "Internal Error", response);
    }

    @Test
    public void testLuckyBallNonPositiveBetDice() throws Exception {
        runTestInit(diceUser);
        Response response = runTestLuckyBall(diceUser, ZERO_BET);
        checkResponse(4, "Internal Error", response);
    }

    @Test
    public void testLuckyBallInsufficientBalanceDice() throws Exception {
        runTestInit(diceUser);
        Response response = runTestLuckyBall(diceUser, VERY_BIG_BET);
        checkResponse(2, "Internal Error", response);
    }


    @Test
    public void testLuckyBallPoker() throws Exception {
        runTestInit(pokerUser);
        Response response = runTestLuckyBall(pokerUser, POSITIVE_BET);
        checkResponse(3, "Internal Error", response);
    }

    private void mockDateTime(int expectedDrawResult){

        DateTime fakeDateTime = new DateTime(0L).minusHours(8).plusSeconds(expectedDrawResult);

        PowerMockito.mockStatic(DateTime.class);
        Mockito.when(DateTime.now()).thenReturn(fakeDateTime);
    }

    private Response runTestSpin(User user, double bet){

        return handler.handleClientRequest(user, GSON.toJson(generateParameters("SPIN", bet)));

    }

    private Response runTestLuckyBall(User user, double bet){

        return handler.handleClientRequest(user, GSON.toJson(generateParameters("LUCKY-BALL", bet)));

    }

    private void checkResponse(int expectedCode, String expectedMessage, Response response){

        Assert.assertEquals(expectedCode, response.getCode());
        Assert.assertEquals(expectedMessage, response.getMessage());

    }

    private Response runTestInit(User user) {

        return handler.handleClientRequest(user, GSON.toJson(generateParameters("INIT", 0D)));

    }

    private Parameters generateParameters(String action, double bet){
        return new Parameters(action, bet);
    }

    private String generateBalanceString(double balance) {
        return "balance: " + balance;
    }


}