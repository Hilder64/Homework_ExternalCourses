package task_3_regex;

import task_3_regex.conroller.Controller;
import task_3_regex.model.Model;
import task_3_regex.view.View;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.processUser();
    }
}
