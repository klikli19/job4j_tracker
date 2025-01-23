package ru.job4j.action;

import ru.job4j.Item;
import ru.job4j.Tracker;
import ru.job4j.input.Input;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "Изменить задачу";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.choice("Введите id задачи: ");
        String name = input.actions("Введите новое имя: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Задача изменена успешно.");
        } else {
            System.out.println("Ошибка при изменении.");
        }
        return true;
    }
}
