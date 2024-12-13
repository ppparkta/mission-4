package pairmatching.model.info;

import pairmatching.util.ExceptionMessage;

public enum Level {
    LEVEL1("레벨1"),
    LEVEL2("레벨2"),
    LEVEL3("레벨3"),
    LEVEL4("레벨4"),
    LEVEL5("레벨5");

    private String name;

    Level(String name) {
        this.name = name;
    }

    public static Level fromName(String levelName) {
        for (Level level : Level.values()) {
            if(level.name.equals(levelName)) {
                return level;
            }
        }
        throw new IllegalArgumentException(ExceptionMessage.LEVEL_NOT_FOUND.getMessage());
    }
}
