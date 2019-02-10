package task_1_mvc;

public class View {
    public static final String INPUT_WORD = "Input word: ";
    public static final String WRONG_INPUT_WORD = "Wrong input! Repeat please! ";
    public static final String OUR_STRING = "Words combination = ";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printMessageAndWords(String message, String words) {
        System.out.println(message + words);
    }
}
