package baseball.domain;

public class ValidateInput {

    public void checkValidate(String inputNumber) {
        int convertNumber = Integer.parseInt(inputNumber);
        if (convertNumber > 999 || convertNumber < 0) {
            throw new IllegalArgumentException("세자리 숫자만 입력 가능합니다.");
        } else if (inputNumber.contains("0")) {
            throw new IllegalArgumentException("1 ~ 9 까지의 숫자만 입력 가능합니다.");
        }
    }
}
