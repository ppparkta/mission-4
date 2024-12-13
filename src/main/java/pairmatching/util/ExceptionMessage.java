package pairmatching.util;

public enum ExceptionMessage {
    FILE_READ_ERROR("파일 읽기에 실패했습니다."),
    FOUND_NOT_FILE("파일 찾기에 실패했습니다."),
    ;
    private final String message;

    ExceptionMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return "[ERROR]" + message;
    }
}
