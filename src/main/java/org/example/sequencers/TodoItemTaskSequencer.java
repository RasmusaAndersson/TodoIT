package org.example.sequencers;

public class TodoItemTaskSequencer {
    private static TodoItemTaskSequencer instance;
    private static int currentId;

    private TodoItemTaskSequencer() {
    }

    public static TodoItemTaskSequencer getInstance() {
        if (instance == null) {
            instance = new TodoItemTaskSequencer();
        }
        return instance;
    }

    public static int nextId() {
        return ++currentId;
    }

    public static int getCurrentId() {
        return currentId;
    }

    public static void setCurrentId(int id) {
        currentId = id;
    }
}

