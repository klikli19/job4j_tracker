package ru.job4j.action;

import ru.job4j.Item;
import ru.job4j.Tracker;
import ru.job4j.input.Input;

public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return "Найти задачу по Id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("Получение задачи по id");
        int id = input.choice("Введите id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Задача с введенным id: " + id + " не найдена.");
        }
        return true;
    }
}
