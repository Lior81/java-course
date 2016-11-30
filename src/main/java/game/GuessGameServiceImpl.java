package game;

import java.util.Random;
import javax.swing.*;

/**
 * Created by Evegeny on 30/11/2016.
 */
public class GuessGameServiceImpl implements GuessGameService {
    private Player player;
    private Random random = new Random();




    @Override
    public void play(int max) {
        int i = 0;
        int numOfTries = 0;
        int number2Guess = random.nextInt(max);


        int userGuess = Integer.parseInt(JOptionPane.showInputDialog("Please enter your guess"));
        while i==0 do {
        if (userGuess <> number2Guess)
            {numOfTries++
             if (userGuess > number2Guess)
                int userGuess = Integer.parseInt(JOptionPane.showInputDialog("Your number is too high, Please try again"));
             else
                 int userGuess = Integer.parseInt(JOptionPane.showInputDialog("Your number is too small, Please try again"));
            }
            else




    @Override
    public void printBestScore() {

    }
}
