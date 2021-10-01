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
        return inputNumber;
    }

}
