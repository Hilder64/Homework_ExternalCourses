package task_2_game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Model model = new Model();
        View view = new View();
        Controler controler = new Controler(model, view);

        controler.processUser(scanner);
    }
}
