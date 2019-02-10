package task_2_game;

public class View {
    public static final String OFFER_TO_PLAY = "Let's play a game ";
    public static final String GAME_RULES =
            "I think up a random number from 0 to 100, and you guess it ";
    public static final String GAME_START = "Well, let's start! ";
    public static final String NUMBER_OF_ATTEMPTS = "Number of attempts to guess the number = ";
    public static final String RANGE_OF_NUMBER = "Range of the secret number = ";
    public static final String INPUT_INT_DATA = "Input INT value = ";
    public static final String WRONG_INPUT_DATA = "Wrong input! Repeat please! ";
    public static final String ENTERED_NUMBER_MORE =
            "The entered number is more than secret number ";
    public static final String ENTERED_NUMBER_LESS =
            "The entered number is less than secret number ";
    public static final String ENTERED_NUMBER_COINCIDE =
            "Congratulations! You guessed the number! ";
    public static final String TIME_SPENT = "Total time = ";
    public static final String WRONG_RANGE_DATA = "Value out of range! Repeat please! ";

    public void printMessage(String message){
        System.out.println(message);
    }
}
