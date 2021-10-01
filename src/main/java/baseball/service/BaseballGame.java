package baseball.service;

import baseball.service.computer.GameMaster;
import baseball.service.player.Player;
import nextstep.utils.Console;

import java.util.List;

public class BaseballGame{
    private GameMaster gameMaster;
    private Player player;

    public boolean runGame() {
        // call game master
        gameMaster = new GameMaster();
        gameMaster.createRandomNumber();
        // call player
        player.getPlayerNumber();


        return true;
    }

    public void endGame(int consoleInput) {
        System.out.println("END");
    }
}
