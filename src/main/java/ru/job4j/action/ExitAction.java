package ru.job4j.action;

import ru.job4j.input.Input;
import ru.job4j.Tracker;

public class ExitAction implements UserAction {
    @Override
    public String name() {
        return "Завершение программы";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("Завершить программу");
        return false;
    }
}
