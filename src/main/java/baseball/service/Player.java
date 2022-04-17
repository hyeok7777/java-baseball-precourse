package baseball.service;

import baseball.domain.ValidateInput;
import camp.nextstep.edu.missionutils.Console;

public class Player {
    private ValidateInput validateInput;
    private String inputNumber;

    public Player() {
        validateInput = new ValidateInput();

    }

    public String getPlayerNumber() {
        boolean validate = false;
        while(!validate) {
            System.out.print("숫자를 입력해주세요 : ");
            inputNumber = Console.readLine();
            validate = validateInput.checkValidate(inputNumber);
        }
        return inputNumber;
    }

    public String getPlayerChoice() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요. ");
        String input = Console.readLine();
        return input;
    }
}
