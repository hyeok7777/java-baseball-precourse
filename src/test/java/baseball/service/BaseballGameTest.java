package baseball.service;

import baseball.domain.NumberCreator;
import baseball.domain.ValidateInput;
import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


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

        assertSimpleTest(() ->
                assertThatThrownBy(() -> validateInput.checkValidate(playerNumber))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }

    @DisplayName("세자리 숫자 이외의 숫자 입력")
    @Test
    public void inputErrorType2() {
        String playerNumber = "1233";
        assertSimpleTest(() ->
                assertThatThrownBy(() -> validateInput.checkValidate(playerNumber))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }

    @DisplayName("입력하지 않음")
    @Test
    public void noInputError() {
        String playerNumber = "";
        assertSimpleTest(() ->
                assertThatThrownBy(() -> validateInput.checkValidate(playerNumber))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }

    @DisplayName("입력하지 않음")
    @Test
    public void noNumeralError() {
        String playerNumber = "abc";
        assertSimpleTest(() ->
                assertThatThrownBy(() -> validateInput.checkValidate(playerNumber))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }

    @DisplayName("중복 된 숫자 입력")
    @Test
    public void sameNumberError() {
        String playerNumber = "111";
        assertSimpleTest(() ->
                assertThatThrownBy(() -> validateInput.checkValidate(playerNumber))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }
}