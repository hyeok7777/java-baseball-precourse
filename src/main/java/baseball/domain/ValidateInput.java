package baseball.domain;

import java.util.HashSet;

public class ValidateInput {

    public boolean checkValidate(String inputNumber) {

        if (!isInputNull(inputNumber)) {
            return false;
        }

        if (!isContaintsZero(inputNumber)) {
            return false;
        }

        if (!isNumeric(inputNumber)) {
            return false;
        }

        if (!isHundred(inputNumber)) {
            return false;
        }

        if(!isSameNumber(inputNumber)) {
            return false;
        }

        return true;

    }

    private boolean isHundred(String inputNumber) {
        if (inputNumber.length() != 3) {
            System.out.println("[ERROR] 세자리 숫자만 입력 가능합니다.");
            return false;
        }
        return true;
    }

    private boolean isContaintsZero(String inputNumber) {
        if (inputNumber.contains("0")) {
            System.out.println("[ERROR] 1 ~ 9 까지의 숫자만 입력 가능합니다.");
            return false;
        }
        return true;
    }

    private boolean isInputNull(String inputNumber) {
        if (inputNumber.length() == 0) {
            System.out.println("[ERROR] 입력이 공백일 수 없습니다.");
            return false;
        }
        return true;
    }

    private boolean isNumeric(String inputNumber) {
        if (!inputNumber.matches("[0-9]+[\\\\.]?[0-9]*")) {
            System.out.println("[ERROR] 숫자만 입력 가능합니다.");
            System.out.println("inputNumber = " + inputNumber.matches("[0-9]+[\\\\.]?[0-9]*"));
            return false;
        }
        return true;
    }

    private boolean isSameNumber(String inputNumber) {
        HashSet<Integer> inputSet = new HashSet<>();
        for (int i = 0; i < inputNumber.length(); i++) {
            inputSet.add(Character.getNumericValue(inputNumber.charAt(i)));
        }
        if (inputSet.size() != 3) {
            System.out.println("[ERROR] 중복 된 자리수가 있습니다.");
            return false;
        }
        return true;

    }
}
