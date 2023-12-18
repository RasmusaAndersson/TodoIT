package org.example;

import java.time.LocalDate;

public class TodoItem {
    private int id;
    private String title;
    private String description;
    private LocalDate deadline;
    private boolean done;
    private Person creator;

    public TodoItem(int id, String title, String description, LocalDate deadline, boolean done, Person creator) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.deadline = deadline;
        this.done = done;
        this.creator = creator;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws IllegalArgumentException {
        if (title == null) {
            throw new IllegalArgumentException("Title was null");
        }
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) throws IllegalArgumentException {
        if (description == null) {
            throw new IllegalArgumentException("Description was null");
        }
        this.description = description;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) throws IllegalArgumentException {
        if (deadline == null) {
            throw new IllegalArgumentException("Deadline was null");
        }
        this.deadline = deadline;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(String done) {
        this.done = Boolean.parseBoolean(done);

    }

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }

    public String getSummary() {
        return "id: " + id + "\ntitle: " + title + "\ndescription: " + description + "\ndeadline: " + deadline + "\ndone: " + done + "\ncreator: " + creator.getSummary();
    }

    public boolean isOverdue() {
        return new LocalDate().after(deadline);
    }
}
