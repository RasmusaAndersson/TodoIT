package org.example.sequencers;

public class TodoItemSequencer {

    private static TodoItemSequencer instance;
    private static int currentId;

    private TodoItemSequencer() {
    }

    public static TodoItemSequencer getInstance() {
        if (instance == null) {
            instance = new TodoItemSequencer();
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
