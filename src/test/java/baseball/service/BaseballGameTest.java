package baseball.service;

import baseball.domain.NumberCreator;
import baseball.domain.ValidateInput;
import org.assertj.core.api.Assertions;
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
        Assertions.assertThat(validateInput.checkValidate(playerNumber)).isEqualTo(false);
    }

    @DisplayName("세자리 숫자 이외의 숫자 입력")
    @Test
    public void inputErrorType2() {
        String playerNumber = "1233";
        Assertions.assertThat(validateInput.checkValidate(playerNumber)).isEqualTo(false);
    }

    @DisplayName("입력하지 않음")
    @Test
    public void noInputError() {
        String playerNumber = "";
        Assertions.assertThat(validateInput.checkValidate(playerNumber)).isEqualTo(false);
    }

    @DisplayName("입력하지 않음")
    @Test
    public void noNumeralError() {
        String playerNumber = "abc";
        Assertions.assertThat(validateInput.checkValidate(playerNumber)).isEqualTo(false);
    }

    @DisplayName("중복 된 숫자 입력")
    @Test
    public void sameNumberError() {
        String playerNumber = "111";
        Assertions.assertThat(validateInput.checkValidate(playerNumber)).isEqualTo(false);
    }
}
