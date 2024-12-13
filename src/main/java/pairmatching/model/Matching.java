package pairmatching.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import pairmatching.model.info.Course;
import pairmatching.model.info.Level;
import pairmatching.model.info.Mission;

public class Matching {
    private final Level level;
    private final Mission mission;
    private final Course course;
    private final List<Pair> pairs = new ArrayList<>();

    public Matching(String level, String mission, String course) {
        Level matchingLevel = Level.fromName(level);
        Mission matchingMission = Mission.fromName(mission, matchingLevel);
        Course matchingCourse = Course.fromName(course);
        this.level = matchingLevel;
        this.mission = matchingMission;
        this.course = matchingCourse;
    }

    public boolean equals(Mission mission, Course course, Level level) {
        if (mission == null || course == null || level == null) {
            return false;
        }
        return this.level == level && this.mission == mission && this.course == course;
    }
}
