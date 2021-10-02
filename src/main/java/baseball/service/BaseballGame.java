package baseball.service;

import baseball.domain.JudgeInput;
import baseball.domain.ValidateInput;
import baseball.domain.MakeNewRandomNumber;
import baseball.service.player.Player;

public class BaseballGame {
    private MakeNewRandomNumber makeNewRandomNumber;
    private Player player;
    private ValidateInput validateInput;
    private JudgeInput judgeInput;

    public BaseballGame() {
        makeNewRandomNumber = new MakeNewRandomNumber();
        player = new Player();
        validateInput = new ValidateInput();
    }

    public void runGame() {
        System.out.println("START");
        // call game master
        makeNewRandomNumber = new MakeNewRandomNumber();
        String randomNumber = makeNewRandomNumber.returnRandomNumber();
        while (true) {
            // call player
            String inputNumber = player.getPlayerNumber();
            // validate input
            validateInput.checkValidate(inputNumber);
            judgeInput = new JudgeInput(inputNumber, randomNumber);
            judgeInput.checkHint();
        }


    }

    public boolean endGame() {
        System.out.println("END");
        return false;
    }
}
