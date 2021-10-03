package baseball.service;

import baseball.domain.JudgeInput;
import baseball.domain.NumberCreator;

public class BaseballGame implements Game{
    private NumberCreator numberCreator;
    private Player player;
    private JudgeInput judgeInput;

    public BaseballGame() {
        numberCreator = new NumberCreator();
        player = new Player();
    }

    @Override
    public void startGame() {
        numberCreator = new NumberCreator();
        String randomNumber = numberCreator.returnRandomNumber();

        runGame(randomNumber);
    }

    private void runGame(String randomNumber) {
        int strike = 0;
        while (strike != 3) {
            String inputNumber = player.getPlayerNumber();
            // validate input
            judgeInput = new JudgeInput(inputNumber, randomNumber);
            strike = judgeInput.checkHint();
        }
        checkContinue(player.getPlayerChoice());
    }

    private void checkContinue(String inputChoice) {
        if (inputChoice.equals("1")) {
            startGame();
        } else if (inputChoice.equals("2")) {
            return;
        }
    }

}
