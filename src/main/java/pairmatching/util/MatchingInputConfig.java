package pairmatching.util;

public enum MatchingInputConfig {
    COURSE(0),
    LEVEL(1),
    MISSION(2),
    ;
    private final int value;

    MatchingInputConfig(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
