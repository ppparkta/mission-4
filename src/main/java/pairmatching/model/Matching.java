package pairmatching.model;

import java.util.ArrayList;
import java.util.List;

public class Matching {
    private final Level level;
    private final Mission mission;
    private final List<Pair> pairs = new ArrayList<>();

    public Matching(String level, String mission) {
        Level matchingLevel = Level.fromName(level);
        Mission matchingMission = Mission.fromName(mission, matchingLevel);
        this.level = matchingLevel;
        this.mission = matchingMission;
    }
}
