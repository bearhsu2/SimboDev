package idv.kuma.game.module;

public class LuckyBallDrawer {

    public int draw(int d, int h, int m, int s){

        int result = (h + m + s) % 10;

        return result;
    }
}
