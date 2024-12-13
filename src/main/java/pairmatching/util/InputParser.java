package pairmatching.util;

import java.util.Arrays;
import java.util.List;
import pairmatching.model.info.Course;
import pairmatching.model.info.Level;
import pairmatching.model.info.Mission;

public class InputParser {
    public List<String> parsePairInput(String input) {
        String[] split = input.split(",");
        if (split.length != 2) {
            throw new IllegalArgumentException(ExceptionMessage.INVALID_INPUT.getMessage());
        }
        List<String> inputs = Arrays.stream(split).toList();
        validate(inputs);
        return inputs;
    }

    private void validate(List<String> inputs) {
        validateCourse(inputs.getFirst());
        Level level = validateLevel(inputs.get(1));
        validateMission(inputs.get(2), level);
    }

    private void validateMission(String missionInput, Level level) {
        Mission.fromName(missionInput, level);
    }

    private Level validateLevel(String levelInput) {
        return Level.fromName(levelInput);
    }

    private void validateCourse(String courseInput) {
        Course.fromName(courseInput);
    }
}
