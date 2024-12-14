package pairmatching.controller;

import java.util.List;
import pairmatching.model.CrewInfo;
import pairmatching.model.MatchingManagement;
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

    public String selectFunc(CrewInfo crewInfo, MatchingManagement matchingManagement) {
        outputView.printFunction();
        String input = consoleInputView.getInput();
        try {
            processFunction(input, crewInfo, matchingManagement);
        } catch (IllegalArgumentException e) {
            outputView.printError(e.getMessage());
        }
        return input;
    }

    private void processFunction(String input, CrewInfo crewInfo, MatchingManagement matchingManagement) {
        if (input.equals("1")) {
            processPairMatching(crewInfo, matchingManagement);
        }
        if (input.equals("2")) {
            processPairQuery(crewInfo, matchingManagement);
        }
        if (input.equals("3")) {
            processPairInit(matchingManagement);
        }
    }

    private void processPairMatching(CrewInfo crewInfo, MatchingManagement matchingManagement) {
        while (true) {
            try {
                List<String> infoInputs = printAndInputMission();
                if (!processExistMatching(matchingManagement, infoInputs)) {
                    continue;
                }
                matchingManagement.matchPair(crewInfo);
                return;
            } catch (IllegalArgumentException e) {
                outputView.printError(e.getMessage());
            }
        }
    }

    private void processPairQuery(CrewInfo crewInfo, MatchingManagement matchingManagement) {
        while (true) {
            try {
                List<String> infoInputs = printAndInputMission();
                return;
            } catch (IllegalArgumentException e) {
                outputView.printError(e.getMessage());
            }
        }
    }

    private void processPairInit(MatchingManagement matchingManagement) {

    }

    private boolean processExistMatching(MatchingManagement matchingManagement, List<String> infoInputs) {
        if (matchingManagement.isExistMatching(infoInputs)) {
            outputView.printDuplicatedMatching();
            String input = consoleInputView.getInput();
            if (!input.equals("네")) {
                return false;
            }
        }
        matchingManagement.deleteMatching(infoInputs);
        return true;
    }

    private List<String> printAndInputMission() {
        outputView.printCourseInfo();
        String input = consoleInputView.getInput();
        return inputParser.parsePairInput(input);
    }
}
