package task_3_regex.view;

public class View {
    public void printMessage(String message) {
        System.out.println(message);
    }

    public String concatenationString(String... message) {
        StringBuilder concatString = new StringBuilder();
        for (String s : message) {
            concatString = concatString.append(s);
        }
        return new String(concatString);
    }

    public void printWrongStringInput(String messageType) {
        printMessage(concatenationString(TextConstants.WRONG_INPUT_DATA,
                TextConstants.INPUT_STRING, messageType));
    }

    public void printRequestMessage(String messageType) {
        printMessage(concatenationString(TextConstants.INPUT_STRING, messageType));
    }
}
