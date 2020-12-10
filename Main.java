package itschool;

import itschool.classes.*;
import itschool.classes.Process;

public class Main {

    public static void main(String[] args) {

        Scheduler scheduler = new Scheduler(8, 16000);
        System.out.println(scheduler);
    }
}
