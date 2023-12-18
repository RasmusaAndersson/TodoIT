package org.example;

import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        Person person = new Person(1337, "Rasmus", "Andersson", "Rasmus.alexander.andersson@gmail.com");
        TodoItem todoItem = new TodoItem(1337, "Complete TodoIt", "Write code", new LocalDate(), false, person);
        TodoItemTask todoItemTask = new TodoItemTask(1337, true, todoItem, person);

        System.out.println(person.toString());
        System.out.println(todoItem.toString());
        System.out.println(todoItemTask.toString());
    }
}
