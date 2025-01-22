package ru.job4j.tracker.tracker.action;

import ru.job4j.tracker.tracker.input.Input;
import ru.job4j.tracker.tracker.Tracker;

public interface UserAction {
    String name ();
    boolean execute(Input input, Tracker tracker);

}
