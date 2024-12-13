package pairmatching.util;

public enum FileConfig {
    BACKEND_FILE_NAME("backend-crew.md"),
    FRONTEND_FILE_NAME("frontend-crew.md"),
    ;
    private final String url;

    FileConfig(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
