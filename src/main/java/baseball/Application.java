package baseball;

import baseball.service.BaseballGame;
import nextstep.utils.Console;

public class Application {
    public static void main(String[] args) {
        // TODO 숫자 야구 게임 구현
        BaseballGame baseballGame = new BaseballGame();
        while(true) {
            baseballGame.runGame();
            if(baseballGame.endGame()) {
                break;
            }
        }
    }
}
