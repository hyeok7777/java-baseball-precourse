package baseball.domain;

import java.util.HashSet;

public class ValidateInput {
    public boolean checkValidate(String inputNumber) {
        isInputNull(inputNumber);
        isContaintsZero(inputNumber);
        isNumeric(inputNumber);
        isHundred(inputNumber);
        isSameNumber(inputNumber);

        return true;
    }

    private boolean isHundred(String inputNumber) {
        if (inputNumber.length() != 3) {
            throw new IllegalArgumentException();
        }
        return true;
    }

    private boolean isContaintsZero(String inputNumber) {
        if (inputNumber.contains("0")) {
            throw new IllegalArgumentException();
        }
        return true;
    }

    private boolean isInputNull(String inputNumber) {
        if (inputNumber.length() == 0) {
            throw new IllegalArgumentException();
        }
        return true;
    }

    private boolean isNumeric(String inputNumber) {
        if (!inputNumber.matches("[0-9]+[\\\\.]?[0-9]*")) {
            throw new IllegalArgumentException();
        }
        return true;
    }

    private boolean isSameNumber(String inputNumber) {
        HashSet<Integer> inputSet = new HashSet<>();
        for (int i = 0; i < inputNumber.length(); i++) {
            inputSet.add(Character.getNumericValue(inputNumber.charAt(i)));
        }
        if (inputSet.size() != 3) {
            throw new IllegalArgumentException();
        }
        return true;

    }
}
