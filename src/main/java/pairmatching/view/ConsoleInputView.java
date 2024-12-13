package pairmatching.view;

import camp.nextstep.edu.missionutils.Console;

public class ConsoleInputView {
    public String getInput() {
        return Console.readLine().replace(" ", "");
    }
}
