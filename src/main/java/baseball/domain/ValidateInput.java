package baseball.domain;

public class ValidateInput {

    public ErrorMessage checkValidate(String inputNumber) {
        int convertNumber = Integer.parseInt(inputNumber);
        if(convertNumber > 999 || convertNumber < 0) {
            return ErrorMessage.NOTHUNDRED;
        } else if(inputNumber.contains("0")) {
            return ErrorMessage.CONTAINZERO;
        }
        return ErrorMessage.NOPROBLEM;
    }
}
