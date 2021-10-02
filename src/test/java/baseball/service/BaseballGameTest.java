package baseball.service;

import baseball.domain.NumberCreator;
import baseball.domain.ValidateInput;
import baseball.service.player.Player;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class BaseballGameTest {
    BaseballGame baseballGame = new BaseballGame();
    NumberCreator numberCreator = new NumberCreator();
    Player player = new Player();
    ValidateInput validateInput = new ValidateInput();

    @DisplayName("3자리 숫자 생성")
    @Test
    public void createRandomNumber() {
        numberCreator.returnRandomNumber();

    }

    @DisplayName("1 ~ 9 이외의 숫자 입력")
    @Test
    public void inputErrorType1() {
        String playerNumber = "101";
        org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, () -> validateInput.checkValidate(playerNumber));
    }

    @DisplayName("세자리 숫자 이외의 숫자 입력")
    @Test
    public void inputErrorType2() {
        String playerNumber = "1233";
        org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, () -> validateInput.checkValidate(playerNumber));
    }
}