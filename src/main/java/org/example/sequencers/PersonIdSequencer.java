package org.example.sequencers;

public class PersonIdSequencer {

    private static PersonIdSequencer instance;
    private static int currentId;

    private PersonIdSequencer() {
    }

    public static PersonIdSequencer getInstance() {
        if (instance == null) {
            instance = new PersonIdSequencer();
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

