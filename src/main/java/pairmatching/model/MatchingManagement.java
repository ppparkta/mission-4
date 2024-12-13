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
        Mission mission = Mission.fromName(infoInputs.get(MatchingInputConfig.MISSION.getValue()), level);
        Course course = Course.fromName(infoInputs.get(MatchingInputConfig.COURSE.getValue()));
        Level level = Level.fromName(infoInputs.get(MatchingInputConfig.LEVEL.getValue()));

        for (Matching matching : matchings) {
            if (matching.equals(mission, course, level)) {
                return true;
            }
        }
        return false;
    }

    public void deleteMatching(List<String> infoInputs) {
        // todo: 중복되는 매칭 삭제하기
    }

    public void matchPair(CrewInfo crewInfo) {
        // todo: 새로운 매칭 생성하기
    }
}
