package baseball.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class JudgeInput {
    private List<Integer> playerNumber;
    private List<Integer> masterNumber;
    private HashMap<Hint, Integer> currentHint;

    public JudgeInput(String inputNumber, String createNumber) {
        playerNumber = makeStringToList(inputNumber);
        masterNumber = makeStringToList(createNumber);
    }

    private List<Integer> makeStringToList(String number) {
        List<Integer> functionList = new ArrayList<>();
        StringTokenizer stringTokenizer = new StringTokenizer(number);

        while (stringTokenizer.hasMoreTokens()) {
            functionList.add(Integer.valueOf(stringTokenizer.nextToken()));
        }

        return functionList;
    }

    public HashMap<Hint, Integer> checkHint() {
        currentHint = new HashMap<>();
        int strike = countStrike();
        int ball = countBall();

        currentHint.put(Hint.STRIKE, strike);
        currentHint.put(Hint.BALL, ball);

        return currentHint;
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
            ball += checkBall(getPlayerNumber, masterNumber);
        }
        return ball;
    }

    private int checkBall(int firstNumber, List<Integer> secondNumber) {
        if (secondNumber.contains(firstNumber)) {
            return 1;
        }
        return 0;
    }

}
