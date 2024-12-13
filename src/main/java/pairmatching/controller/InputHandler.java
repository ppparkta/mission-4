package pairmatching.controller;

import pairmatching.util.InputParser;
import pairmatching.view.ConsoleInputView;
import pairmatching.view.OutputView;

public class InputHandler {
    private final ConsoleInputView consoleInputView;
    private final OutputView outputView;
    private final InputParser inputParser;

    public InputHandler(OutputView outputView) {
        this.consoleInputView = new ConsoleInputView();
        this.outputView = outputView;
        this.inputParser = new InputParser();
    }

    public String selectFunc() {
        outputView.printFunction();
        String input = consoleInputView.getInput();
        try {
            processFunction(input);
        } catch (IllegalArgumentException e) {
            outputView.printError(e.getMessage());
        }
        return input;
    }

    private void processFunction(String input) {
        if (input.equals("1")) {
            processPairMatching();
        }
        if (input.equals("2")) {
            processPairQuery();
        }
        if (input.equals("3")) {
            processPairInit();
        }
    }

    private void processPairMatching() {
        outputView.printCourseInfo();
        String input = consoleInputView.getInput();
        inputParser.parsePairInput(input);
    }

    private void processPairQuery() {
        outputView.printCourseInfo();
        String input = consoleInputView.getInput();
        inputParser.parsePairInput(input);
    }

    private void processPairInit() {

    }
}
