package pairmatching.model;

import pairmatching.model.info.Course;

public class Crew {
    private final Course course;
    private final String name;

    public Crew(Course course, String name) {
        this.course = course;
        this.name = name;
    }
}
