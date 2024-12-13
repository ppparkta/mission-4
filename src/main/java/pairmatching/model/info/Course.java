package pairmatching.model.info;

import pairmatching.util.ExceptionMessage;

public enum Course {
    BACKEND("백엔드"),
    FRONTEND("프론트엔드");

    private String name;

    Course(String name) {
        this.name = name;
    }

    public static Course fromName(String name) {
        for (Course course : Course.values()) {
            if (name.equals(course.name)) {
                return course;
            }
        }
        throw new IllegalArgumentException(ExceptionMessage.COURSE_NOT_FOUND.getMessage());
    }
}
