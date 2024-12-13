package pairmatching.model.info;

import pairmatching.util.ExceptionMessage;

public enum Mission {
    CAR("자동차경주", Level.LEVEL1),
    LOTTO("로또", Level.LEVEL1),
    BASEBALL("숫자야구게임", Level.LEVEL1),
    CART("장바구니", Level.LEVEL2),
    PAYMENT("결제", Level.LEVEL2),
    SUBWAY("지하철노선도", Level.LEVEL2),
    PERFORMANCE("성능개선", Level.LEVEL4),
    DEPLOY("배포", Level.LEVEL4),
    ;

    private final String name;
    private final Level level;

    Mission(String name, Level level) {
        this.name = name;
        this.level = level;
    }

    public static Mission fromName(String mission, Level matchingLevel) {
        for (Mission m : Mission.values()) {
            if (m.name.equals(mission) && m.level == matchingLevel) {
                return m;
            }
        }
        throw new IllegalArgumentException(ExceptionMessage.MISSION_NOT_FOUND.getMessage());
    }
}
