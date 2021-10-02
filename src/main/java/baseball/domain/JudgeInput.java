package baseball.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class JudgeInput {
    private List<Integer> playerNumber;
    private List<Integer> masterNumber;
    private HintOutput hintOutput;

    public JudgeInput(String inputNumber, String createNumber) {
        playerNumber = makeStringToList(inputNumber);
        masterNumber = makeStringToList(createNumber);
    }

    private List<Integer> makeStringToList(String number) {
        List<Integer> functionList = new ArrayList<>();

        for(int i = 0 ; i < number.length() ; i++) {
            functionList.add(Character.getNumericValue(number.charAt(i)));
        }
        return functionList;
    }

    public String checkHint() {

        ArrayList<HintOutput> hintOutputArrayList = new ArrayList<>();
        int strike = countStrike();
        int ball = countBall();

        if (strike > 0) {
            hintOutput = new HintOutput("STRIKE", strike);
        }
        if(ball > 0) {
            hintOutput = new HintOutput("BALL", ball);
        }
        if(strike == 0 && ball == 0) {
            hintOutput = new HintOutput("NOTHING", 0);
            hintOutputArrayList.add(hintOutput);
        }
        System.out.println("strike = " + strike);
        System.out.println("ball = " + ball);
        return hintOutputArrayList.toString();
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
