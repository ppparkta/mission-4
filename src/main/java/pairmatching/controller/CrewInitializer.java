package pairmatching.controller;

import java.util.List;
import pairmatching.model.Course;
import pairmatching.model.Crew;
import pairmatching.model.CrewInfo;
import pairmatching.util.FileConfig;
import pairmatching.view.FileInputView;

public class CrewInitializer {
    private final CrewInfo crewInfo;
    private final FileInputView fileInputView;

    public CrewInitializer() {
        fileInputView = new FileInputView();
        this.crewInfo = init();
    }

    public CrewInfo getCrewInfo() {
        return crewInfo;
    }

    private CrewInfo init() {
        List<String> backInputs = fileInputView.getInput(FileConfig.BACKEND_FILE_NAME.getUrl());
        List<Crew> backends = createCrew(backInputs, "백엔드");
        List<String> frontInputs = fileInputView.getInput(FileConfig.FRONTEND_FILE_NAME.getUrl());
        List<Crew> frontends = createCrew(frontInputs, "프론트엔드");
        return CrewInfo.of(backends, frontends);
    }

    private List<Crew> createCrew(List<String> nameInputs, String courseInfo) {
        Course course = Course.fromName(courseInfo);

        return nameInputs.stream()
                .map(nameInput -> new Crew(course, nameInput)).toList();
    }
}
