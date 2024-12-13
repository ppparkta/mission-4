package pairmatching.controller;

import pairmatching.util.ExceptionMessage;
import pairmatching.view.ConsoleInputView;
import pairmatching.view.OutputView;

public class PairController {
    private final CrewInitializer crewInitializer;
    private final
    private final InputHandler inputHandler;
    private final OutputView outputView;

    public PairController() {
        crewInitializer = new CrewInitializer();
        outputView = new OutputView();
        inputHandler = new InputHandler(outputView);
    }

    public void run() {
        String input = "0";
        do {
            input = inputHandler.selectFunc();
            if (!input.equals("1") && !input.equals("2") && !input.equals("3") && !input.equals("Q")) {
                outputView.printError(ExceptionMessage.INVALID_INPUT.getMessage());
            }
        } while (!input.equals("Q"));
    }
}
