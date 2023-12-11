package org.example;

public class TodoItemTask {
    private int id;
    private boolean assigned;
    private TodoItem todoItem;
    private Person assignee;

    public TodoItemTask(int id, boolean assigned, TodoItem todoItem, Person assignee) {
        this.id = id;
        this.assigned = assigned;
        this.todoItem = todoItem;
        this.assignee = assignee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(String assigned)throws IllegalAccessException{
        if (assigned == null){
            throw new IllegalAccessException("Assigned was null");
        }
        this.assigned = Boolean.parseBoolean(assigned);
    }

    public TodoItem getTodoItem() {
        return todoItem;
    }

    public void setTodoItem(TodoItem todoItem)throws IllegalAccessException{
        if (todoItem != null){
            throw new IllegalAccessException("TodoItem wasn't null");
        }
        this.todoItem = todoItem;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
    }

    public String getSummary() {
        return "ID: " + id + "\nAssigned: " + assigned + "\nTodo Item: " + todoItem + "\nAssignee: " + assignee;
    }
}
