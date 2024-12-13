package pairmatching.model;

import java.util.ArrayList;
import java.util.List;

public class CrewInfo {
    private final List<Crew> backendCrews = new ArrayList<>();
    private final List<Crew> frontendCrews = new ArrayList<>();

    public static CrewInfo of(List<Crew> backends, List<Crew> frontends) {
        CrewInfo crewInfo = new CrewInfo();
        crewInfo.backendCrews.addAll(backends);
        crewInfo.frontendCrews.addAll(frontends);
        return crewInfo;
    }
}
