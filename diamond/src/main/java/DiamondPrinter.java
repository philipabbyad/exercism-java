import java.util.ArrayList;
import java.util.List;

class DiamondPrinter {

    List<String> printToList(char letter) {
        int enteredLetterValue = 0;
        int numRows = 0;
        List<String> diamondOutput = new ArrayList<String>();

        if (!Character.isLetter(letter)) {
            throw new IllegalArgumentException("Must enter a single letter A-Z");
        }

        enteredLetterValue = Character.toUpperCase(letter) - 64;
        numRows = (enteredLetterValue * 2) - 1;

        for (int rowNum = 1; rowNum <= 1; rowNum++ ) {
            StringBuilder rowOutput = new StringBuilder();

            rowOutput.append(createSpaces(enteredLetterValue - rowNum));
            rowOutput.append('A');
            rowOutput.append(createSpaces(enteredLetterValue - rowNum));

            diamondOutput.add(rowOutput.toString());
        }

        

        for (int rowNum = 2; rowNum <= ((numRows + 1) / 2); rowNum++ ) {
            StringBuilder rowOutput = new StringBuilder();
            int rowLetterValue = rowNum + 64;
            char rowLetter = Character.toChars(rowLetterValue)[0];

            rowOutput.append(createSpaces(enteredLetterValue - rowNum));
            rowOutput.append(rowLetter);
            rowOutput.append(createSpaces((rowNum * 2) - 3));
            rowOutput.append(rowLetter);
            rowOutput.append(createSpaces(enteredLetterValue - rowNum));

            diamondOutput.add(rowOutput.toString());
        }

        return diamondOutput;
    }

    String createSpaces(int numSpaces) {
        StringBuilder spaceString = new StringBuilder();
        
        for (int spaceIndex = 0; spaceIndex < numSpaces; spaceIndex++ ) {
            spaceString.append('-');
        }

        return spaceString.toString();
    }
    


    public static void main(String[] args) {
        DiamondPrinter test = new DiamondPrinter();
        System.out.println(test.printToList('E'));
	}


}


