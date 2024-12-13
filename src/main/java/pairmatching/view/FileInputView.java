package pairmatching.view;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import pairmatching.util.ExceptionMessage;

public class FileInputView {
    public List<String> getInput(String filename) {
        Set<String> inputLines = new HashSet<>();
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(filename);
        validateInputStream(inputStream);
        try (Scanner scanner = new Scanner(inputStream)) {
            readLine(inputLines, scanner);
        } catch (Exception e) {
            System.err.println(ExceptionMessage.FILE_READ_ERROR.getMessage());
        }
        return List.copyOf(inputLines);
    }

    private static void validateInputStream(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalArgumentException(ExceptionMessage.FILE_FOUND_NOT.getMessage());
        }
    }

    private void readLine(Set<String> inputLines, Scanner scanner) {
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().replace(" ", "");
            if (inputLines.contains(line)) {
                throw new IllegalArgumentException(ExceptionMessage.CREW_NAME_DUPLICATED.getMessage());
            }
            inputLines.add(line);
        }
    }
}
