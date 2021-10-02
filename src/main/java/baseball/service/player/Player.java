package baseball.service.player;

import baseball.domain.ValidateInput;
import nextstep.utils.Console;

public class Player {
    private ValidateInput validateInput;

    public Player() {
        validateInput = new ValidateInput();
    }

    public String getPlayerNumber() {
        System.out.print("숫자를 입력해주세요 : ");
        String inputNumber = Console.readLine();
        validateInput.checkValidate(inputNumber);
        return inputNumber;
    }

    public String getPlayerChoice() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요. ");
        String input = Console.readLine();
        return input;
    }

}
