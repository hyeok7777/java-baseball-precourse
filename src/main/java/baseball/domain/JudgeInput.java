package baseball.domain;

import java.util.ArrayList;
import java.util.List;

public class JudgeInput {
    private List<Integer> playerNumber;
    private List<Integer> masterNumber;

    public JudgeInput(String inputNumber, String createNumber) {
        playerNumber = makeStringToList(inputNumber);
        masterNumber = makeStringToList(createNumber);
    }

    private List<Integer> makeStringToList(String number) {
        List<Integer> functionList = new ArrayList<>();

        for (int i = 0; i < number.length(); i++) {
            functionList.add(Character.getNumericValue(number.charAt(i)));
        }
        return functionList;
    }

    public int checkHint() {

        int strike = countStrike();
        int ball = countBall();

        if (strike == 3) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 끝");
            return strike;
        }
        if (strike > 0) {
            System.out.print(strike + "스트라이크 ");
        }
        if (ball > 0) {
            System.out.print(ball + "볼");
        }
        if (strike == 0 && ball == 0) {
            System.out.print("낫싱");
        }

        System.out.println();

        return strike;
    }

    private int countStrike() {
        int strike = 0;
        for (int i = 0; i < playerNumber.size(); i++) {
            int getPlayerNumber = playerNumber.get(i);
            int getMasterNumber = masterNumber.get(i);
            strike += checkStrike(getPlayerNumber, getMasterNumber);
        }
        return strike;
    }

    private int checkStrike(int firstNumber, int secondNumber) {
        if (firstNumber == secondNumber) {
            return 1;
        }
        return 0;
    }

    private int countBall() {
        int ball = 0;
        for (int i = 0; i < playerNumber.size(); i++) {
            int getPlayerNumber = playerNumber.get(i);
            int getCompareNumber = masterNumber.get(i);
            ball += checkBall(getPlayerNumber, getCompareNumber, masterNumber);
        }
        return ball;
    }

    private int checkBall(int firstNumber, int compareNumber, List<Integer> secondNumber) {
        if (secondNumber.contains(firstNumber) && firstNumber != compareNumber) {
            return 1;
        }
        return 0;
    }

}
