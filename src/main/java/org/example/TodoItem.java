package org.example;

import java.util.Date;

public class TodoItem {
    private int id;
    private String title;
    private String description;
    private Date deadline;
    private boolean done;
    private Person creator;

    public TodoItem(int id, String title, String description, Date deadline, boolean done, Person creator) {
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

    public void setTitle(String title) throws IllegalAccessException {
        if (title == null) {
            throw new IllegalAccessException("Title was null");
        }
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) throws IllegalAccessException {
        if (description == null) {
            throw new IllegalAccessException("Description was null");
        }
        this.description = description;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) throws IllegalAccessException {
        if (deadline == null) {
            throw new IllegalAccessException("Deadline was null");
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
        return new Date().after(deadline);
    }
}
