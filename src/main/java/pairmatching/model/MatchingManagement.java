package pairmatching.model;

import java.util.ArrayList;
import java.util.List;
import pairmatching.model.info.Course;
import pairmatching.model.info.Level;
import pairmatching.model.info.Mission;
import pairmatching.util.MatchingInputConfig;

public class MatchingManagement {
    private final List<Matching> matchings = new ArrayList<>();

    public boolean isExistMatching(List<String> infoInputs) {
        InfoResult result = getInfoResult(infoInputs);

        for (Matching matching : matchings) {
            if (matching.equals(result.mission(), result.course(), result.level())) {
                return true;
            }
        }
        return false;
    }

    public void deleteMatching(List<String> infoInputs) {
        InfoResult result = getInfoResult(infoInputs);

        matchings.removeIf(matching -> matching.equals(result.mission(), result.course(), result.level()));
    }

    public void matchPair(CrewInfo crewInfo, List<String> infoInputs) {
        // todo: 새로운 매칭 생성하기
        InfoResult result = getInfoResult(infoInputs);

        

    }

    private static InfoResult getInfoResult(List<String> infoInputs) {
        Course course = Course.fromName(infoInputs.get(MatchingInputConfig.COURSE.getValue()));
        Level level = Level.fromName(infoInputs.get(MatchingInputConfig.LEVEL.getValue()));
        Mission mission = Mission.fromName(infoInputs.get(MatchingInputConfig.MISSION.getValue()), level);
        return new InfoResult(course, level, mission);
    }

    private record InfoResult(Course course, Level level, Mission mission) {
    }
}
