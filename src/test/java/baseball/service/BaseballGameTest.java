package baseball.service;

import baseball.domain.ValidateInput;
import baseball.service.computer.GameMaster;
import baseball.service.player.Player;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;


class BaseballGameTest {
    BaseballGame baseballGame = new BaseballGame();
    GameMaster gameMaster = new GameMaster();
    Player player = new Player();
    ValidateInput validateInput = new ValidateInput();

    @DisplayName("3자리 숫자 생성")
    @Test
    public void createRandomNumber() {
        List<Integer> randomNumber = gameMaster.createRandomNumber();
        Assertions.assertThat(randomNumber.size()).isEqualTo(3);

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