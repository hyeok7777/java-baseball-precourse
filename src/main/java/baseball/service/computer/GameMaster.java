package baseball.service.computer;

import baseball.domain.ValidateInput;
import nextstep.utils.Console;
import nextstep.utils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class GameMaster {
    private final int MIN_NUMBER = 1;
    private final int MAX_NUMBER = 9;
    private ValidateInput validateInput;

    // 1. 1 ~ 9로 이루어진 세자리 숫자를 nextstep.utils.Randoms의 pickNumberInRange를 이용하여 생성
    public List<Integer> createRandomNumber() {
        List<Integer> randomNumber = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            int tempNumber = Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER);
            randomNumber.add(tempNumber);
        }
        return randomNumber;
    }


}
