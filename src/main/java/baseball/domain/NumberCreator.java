package baseball.domain;

import nextstep.utils.Randoms;

public class NumberCreator {
    private final int MIN_NUMBER = 1;
    private final int MAX_NUMBER = 9;
    private final int SIZE_NUMBER = 3;
    String randomNumber;

    public String returnRandomNumber() {
        randomNumber = new String();
        int tempNumber = 0;
        while (randomNumber.length() < SIZE_NUMBER) {
            tempNumber = Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER);
            checkAndAddNumber(randomNumber, tempNumber);
        }
        return randomNumber;
    }

    private void checkAndAddNumber(String currentString, int tempNumber) {
        if (!currentString.contains(Integer.toString(tempNumber))) {
            randomNumber += tempNumber;
        }
    }
}
