package org.example;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(1337, "Rasmus", "Andersson", "Rasmus.alexander.andersson@gmail.com");
        TodoItem todoItem = new TodoItem(1, "Complete TodoIt", "Write code", new Date(), false, person);
        TodoItemTask todoItemTask = new TodoItemTask(1, true, todoItem, person);

        System.out.println(person.getSummary());
        System.out.println(todoItem.getSummary());
        System.out.println(todoItemTask.getSummary());
    }
}
