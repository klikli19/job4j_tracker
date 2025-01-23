package ru.job4j.action;

import ru.job4j.Tracker;
import ru.job4j.input.Input;

public interface UserAction {
    String name();

    boolean execute(Input input, Tracker tracker);

}
