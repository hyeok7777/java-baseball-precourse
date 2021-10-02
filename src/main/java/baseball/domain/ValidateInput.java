package baseball.domain;

public class ValidateInput {

    public void checkValidate(String inputNumber) {
        if (inputNumber.length() != 3) {
            throw new IllegalArgumentException("[ERROR] 세자리 숫자만 입력 가능합니다.");
        } else if (inputNumber.contains("0")) {
            throw new IllegalArgumentException("[ERROR] 1 ~ 9 까지의 숫자만 입력 가능합니다.");
        }
    }
}
