package baseball.service;

public class BaseballGame implements Game {

    @Override
    public void startGame() {
        System.out.println("START");
    }

    @Override
    public void checkContinue(int consoleInput) {

    }
}
