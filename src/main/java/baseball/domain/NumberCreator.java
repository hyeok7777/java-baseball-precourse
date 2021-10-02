package baseball.domain;

import nextstep.utils.Randoms;

public class NumberCreator {
    private final int MIN_NUMBER = 1;
    private final int MAX_NUMBER = 9;
    private final int SIZE_NUMBER = 3;
    String randomNumber;
    private ValidateInput validateInput;

    // 1. 1 ~ 9로 이루어진 서로다른 세자리 숫자를 nextstep.utils.Randoms의 pickNumberInRange를 이용하여 생성
    public String returnRandomNumber() {
        randomNumber = new String();
        int tempNumber = 0;
        while (randomNumber.length() < SIZE_NUMBER) {
            tempNumber = Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER);
            checkAndAddNumber(randomNumber, tempNumber);
        }
        System.out.println("randomNumber = " + randomNumber);
        return randomNumber;
    }

    private void checkAndAddNumber(String currentString, int tempNumber) {
        if (!currentString.contains(Integer.toString(tempNumber))) {
            randomNumber += tempNumber;
        }
    }



}
