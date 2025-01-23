package ru.job4j.action;

import ru.job4j.Item;
import ru.job4j.Tracker;
import ru.job4j.input.Input;

import java.util.List;

public class FindAllAction implements UserAction {
    @Override
    public String name() {
        return "Показать все задачи";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("Получение всех задач");
        List<Item> items = tracker.findAll();
        if (!items.isEmpty()) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("Нет задач");
        }
        return true;
    }
}
