package org.example;

import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        AppUser appUser = new AppUser("Rasmus", "password", AppRole.ROLE_APP_USER);
        Person person = new Person(1337, "Rasmus", "Andersson", "Rasmus.alexander.andersson@gmail.com");
        TodoItem todoItem = new TodoItem(1337, "Complete TodoIt", "Write code", LocalDate.now(), false, person);
        TodoItemTask todoItemTask = new TodoItemTask(1337, true, todoItem, person);

        System.out.println(appUser);
        System.out.println(person);
        System.out.println(todoItem);
        System.out.println(todoItemTask);
    }
}
