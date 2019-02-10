package task_1_mvc;

public class Model {
    private String value;

    public String addWordOurValue(String word) {
        return value += " " + word;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
