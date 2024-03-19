package dev.lpa;

enum Priority{HIGH, MDEIUM, LOW}

enum Status{IN_QUEUE, ASSIGNED, IN_PROGRESS}

public class Task {

    // Each task belongs to some project
    private String project;
    private String description;
    private String assignee;

}
