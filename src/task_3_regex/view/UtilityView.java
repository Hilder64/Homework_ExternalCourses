package task_3_regex.view;

public class UtilityView {
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
}
