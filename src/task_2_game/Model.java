package task_2_game;

import java.util.Random;

public class Model {
    private static int SECRET_NUMBER;
    private static int RAND_MAX = 100;
    private int minOfRange;
    private int maxOfRange;
    private boolean numberCoincide;

    public Model() {
        SECRET_NUMBER = rand();
        minOfRange = 0;
        maxOfRange = 100;
        numberCoincide = false;
    }

    private int rand(int min, int max) {
        int value = 0;
        Random random = new Random();
        while (true) {
            value = (int) Math.pow(-1, random.nextInt(10)) * random.nextInt(maxAbs(min, max) + 1);
            if (min <= value && value <= max) {
                break;
            }
        }
        return value;
    }

    private int maxAbs(int firstNumber, int secondNumber) {
        if (Math.abs(firstNumber) < Math.abs(secondNumber)) {
            return Math.abs(secondNumber);
        } else {
            return Math.abs(firstNumber);
        }
    }

    private int rand() {
        return rand(0, RAND_MAX);
    }

    public InputValueState checkNumber(int inputNumber) {
        if (SECRET_NUMBER < inputNumber) {
            maxOfRange = inputNumber;
            return InputValueState.MORE;
        } else if (SECRET_NUMBER > inputNumber) {
            minOfRange = inputNumber;
            return InputValueState.MORE;
        } else {
            numberCoincide = true;
            return InputValueState.COINCIDE;
        }
    }

    public String getRange() {
        return String.join("-", (Integer.toString(minOfRange)), (Integer.toString(maxOfRange)));
    }

    public boolean isNumberCoincide() {
        return numberCoincide;
    }

    public int getMinOfRange() {
        return minOfRange;
    }

    public int getMaxOfRange() {
        return maxOfRange;
    }
}
