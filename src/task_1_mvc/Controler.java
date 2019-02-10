package task_1_mvc;

import java.util.Scanner;

public class Controler {
    public static final String REGEX_FIRST_WORD = "Hello";
    public static final String REGEX_SECOND_WORD = "world!";

    private Model model;
    private View view;

    public Controler(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser(Scanner scanner) {
        boolean state = false;
        model.setValue(inputStringValueWithScanner(scanner, state));
        state = true;
        model.addWordOurValue(inputStringValueWithScanner(scanner, state));

        view.printMessageAndWords(View.OUR_STRING, model.getValue());
    }

    public String inputStringValueWithScanner(Scanner scanner, boolean state) {
        view.printMessage(View.INPUT_WORD);
        if (!state) {
            while (!scanner.hasNext(REGEX_FIRST_WORD)) {
                view.printMessage(View.WRONG_INPUT_WORD + View.INPUT_WORD);
                scanner.next();
            }
        } else {
            while (!scanner.hasNext(REGEX_SECOND_WORD)) {
                view.printMessage(View.WRONG_INPUT_WORD + View.INPUT_WORD);
                scanner.next();
            }
        }
        return scanner.next();
    }
}
