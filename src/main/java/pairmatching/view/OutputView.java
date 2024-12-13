package pairmatching.view;

import pairmatching.util.ExceptionMessage;

public class OutputView {
    public void printError(String message) {
        System.out.println(message);
    }

    public void printFunction() {
        System.out.println("기능을 선택하세요.");
        System.out.println("1. 페어 매칭");
        System.out.println("2. 페어 조회");
        System.out.println("3. 페어 초기화");
        System.out.println("Q. 종료");
    }

    public void printCourseInfo() {
        printMissionInfo();
        System.out.println("과정, 레벨, 미션을 선택하세요.\n"
                + "ex) 백엔드, 레벨1, 자동차경주");
    }

    public void printDuplicatedMatching() {
        System.out.println("매칭 정보가 있습니다. 다시 매칭하시겠습니까?\n" +
                "네 | 아니오"
        );
    }

    private void printMissionInfo() {
        System.out.println("#############################################\n" +
                "과정: 백엔드 | 프론트엔드\n" +
                "미션:\n" +
                "  - 레벨1: 자동차경주 | 로또 | 숫자야구게임\n" +
                "  - 레벨2: 장바구니 | 결제 | 지하철노선도\n" +
                "  - 레벨3: \n" +
                "  - 레벨4: 성능개선 | 배포\n" +
                "  - 레벨5: \n" +
                "#############################################"
        );
    }
}
