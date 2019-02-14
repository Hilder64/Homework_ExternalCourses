package task_2_game;

import java.util.Scanner;

public class Controler {
    private Model model;
    private View view;
    private int attempsCounter;
    private StopWatch stopWatch;

    public Controler(Model model, View view) {
        this.model = model;
        this.view = view;
        attempsCounter = 0;
        stopWatch = new StopWatch();
        stopWatch.start();
    }

    public void processUser(Scanner scanner) {
        view.printMessage(View.OFFER_TO_PLAY);
        view.printMessage(View.GAME_RULES);
        view.printMessage(View.GAME_START);
        while (!model.isNumberCoincide()) {
            view.printMessage(getResultCompare(model.checkNumber(inputNumberWithScannerAndDiapason(scanner))));
            attempsCounter++;
        }
        stopWatch.stop();
        view.printMessage(View.NUMBER_OF_ATTEMPTS + attempsCounter);
        view.printMessage(View.TIME_SPENT + Math.floor(stopWatch.getElapsedTime().toMillis() / 1000.));
    }

    private String getResultCompare(InputValueState state) {
        switch (state) {
            case MORE:
                return View.ENTERED_NUMBER_MORE;
            case LESS:
                return View.ENTERED_NUMBER_LESS;
            case COINSIDE:
                return View.ENTERED_NUMBER_COINCIDE;
            default:
                throw new RuntimeException();
        }
    }

    private int inputNumberWithScannerAndDiapason(Scanner scanner) {
        int result = 0;
        view.printMessage(view.RANGE_OF_NUMBER + model.getRange());
        view.printMessage(view.INPUT_INT_DATA);
        while (true) {
            while (!scanner.hasNextInt()) {
                view.printMessage(View.WRONG_INPUT_DATA);
                view.printMessage(View.INPUT_INT_DATA);
                scanner.nextLine();
            }
            if ((result = scanner.nextInt()) < model.getMinOfRange() ||
                    result > model.getMaxOfRange()) {
                view.printMessage(View.WRONG_RANGE_DATA);
                view.printMessage(view.RANGE_OF_NUMBER + model.getRange());
                view.printMessage(View.INPUT_INT_DATA);
                continue;
            }
            break;
        }
        return result;
    }
}
