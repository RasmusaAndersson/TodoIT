package org.example.dao;

import java.util.Collection;

public interface TodoItemDAO<TodoItem, Integer> {

    TodoItem persist(TodoItem todoItem);


    org.example.TodoItem persist(org.example.TodoItem todoItem);

    ´TodoItem findByUsername(String username);


    Collection<TodoItem> findAll();


    void remove(String username);
}