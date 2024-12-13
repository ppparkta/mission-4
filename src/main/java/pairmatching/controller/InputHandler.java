package pairmatching.controller;

import pairmatching.view.ConsoleInputView;
import pairmatching.view.OutputView;

public class InputHandler {
    private final ConsoleInputView consoleInputView;
    private final OutputView outputView;

    public InputHandler(OutputView outputView) {
        this.consoleInputView = new ConsoleInputView();
        this.outputView = outputView;
    }

    public String selectFunc() {
        outputView.printFunction();
        String input = consoleInputView.getInput();
        try {
            if (input.equals("1")) {
                processPairMatching();
            }
            if (input.equals("2")) {
                processPairQuery();
            }
            if (input.equals("3")) {
                processPairInit();
            }
        } catch (IllegalArgumentException e) {
            outputView.printError(e.getMessage());
        }
        return input;
    }

    private void processPairMatching() {
        outputView.printCourseInfo();
    }

    private void processPairQuery() {
        outputView.printCourseInfo();
    }

    private void processPairInit() {

    }
}
