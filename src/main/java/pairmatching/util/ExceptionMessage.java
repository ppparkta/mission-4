package pairmatching.util;

public enum ExceptionMessage {
    FILE_READ_ERROR("파일 읽기에 실패했습니다."),
    FILE_FOUND_NOT("파일 찾기에 실패했습니다."),

    COURSE_NOT_FOUND("코스 찾기에 실패했습니다."),
    LEVEL_NOT_FOUND(),
    MISSION_NOT_FOUND(),
    CREW_NAME_DUPLICATED("크루원 이름이 중복됩니다."),
    INVALID_INPUT("존재하지 않는 기능입니다."),
    ;
    private final String message;

    ExceptionMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return "[ERROR]" + message;
    }
}
