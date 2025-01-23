package ru.job4j.action;

import ru.job4j.input.Input;
import ru.job4j.Item;
import ru.job4j.Tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "Удалить задачу";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("Удаление задачи");
        int id = input.choice("Введите id: ");
        Item items  = tracker.findById(id);
        tracker.delete(id);
        System.out.println(items != null ? "Задача удалена успешно." : "Ошибка удаления задачи.");
        return true;
    }
}
