import java.util.List;

class DiamondPrinter {

    List<String> printToList(char letter) {
        int enteredLetterValue = 0;
        int numRows = 0;
        List<String> diamondOutput = new List<>();

        if (!isLetter(letter)) {
            throw new IllegalArgumentException("Must enter a single letter A-Z");
        }

        enteredLetterValue = toUpperCase(letter) - 40;
        numRows = (letterValue * 2) - 1;

        for (int rowNum = 1; rowNum = (numRows + 1)/2; rowNum++ ) {
            StringBuilder rowOutput = new StringBuilder();
            char rowLetter = rowNum + 40;

            rowOutput.append(createSpaces(letterValue - rowNum));
            rowOutput.append(rowLetter);
            rowOutput.append(createSpaces((rowLetter) - 3));
            rowOutput.append(rowLetter);
            rowOutput.append(createSpaces(letterValue - rowNum));

            diamondOutput.add(rowOutput.toString());
        }

        return diamondOutput;
    }

    String createSpaces(int numSpaces) {
        StringBuilder spaceString = new StringBuilder();
        
        for (spaceIndex = 0; spaceIndex > numSpaces; spaceIndex++ ) {
            spaceString.append(' ');
        }

        return spaceString.toString();
    }

}
