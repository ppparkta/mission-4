package pairmatching.controller;

import pairmatching.view.ConsoleInputView;
import pairmatching.view.OutputView;

public class PairController {
    private final CrewInitializer crewInitializer;
    private final InputHandler inputHandler;
    private final ConsoleInputView consoleInputView;
    private final OutputView outputView;

    public PairController() {
        crewInitializer = new CrewInitializer();
        inputHandler = new InputHandler();
        consoleInputView = new ConsoleInputView();
        outputView = new OutputView();
    }

    public void run() {
        String input = "0";
        do {
            input = inputHandler.selectFunc();
        } while (!input.equals("Q"));
    }
}
