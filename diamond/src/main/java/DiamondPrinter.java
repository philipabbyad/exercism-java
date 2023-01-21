import java.util.ArrayList;
import java.util.List;

class DiamondPrinter {
    private int enteredLetterValue = 0;
    private int numRows = 0;
    private List<String> diamondOutput = new ArrayList<String>();

    public List<String> printToList(char letter) {

        if (!Character.isLetter(letter)) {
            throw new IllegalArgumentException("Must enter a single letter A-Z");
        }

        enteredLetterValue = Character.toUpperCase(letter) - 64;
        numRows = (enteredLetterValue * 2) - 1;

        diamondOutput.add(createLetterARow());

        for (int rowNum = 2; rowNum <= ((numRows + 1) / 2); rowNum++) {
            diamondOutput.add(createAnyOtherLetterRow(rowNum));
        }

        for (int rowNum = (((numRows + 1) / 2) - 1); rowNum >= 2; rowNum--) {
            diamondOutput.add(createAnyOtherLetterRow(rowNum));
        }

        if (numRows > 1) {
            diamondOutput.add(createLetterARow());
        }

        return diamondOutput;
    }

    public String createLetterARow() {
        StringBuilder rowOutput = new StringBuilder();

        rowOutput.append(createSpaces(this.enteredLetterValue - 1));
        rowOutput.append('A');
        rowOutput.append(createSpaces(this.enteredLetterValue - 1));

        return rowOutput.toString();
    }

    public String createAnyOtherLetterRow(int rowNum) {
        StringBuilder rowOutput = new StringBuilder();
        char rowLetter = Character.toChars(rowNum + 64)[0];

        rowOutput.append(createSpaces(this.enteredLetterValue - rowNum));
        rowOutput.append(rowLetter);
        rowOutput.append(createSpaces((rowNum * 2) - 3));
        rowOutput.append(rowLetter);
        rowOutput.append(createSpaces(this.enteredLetterValue - rowNum));

        return rowOutput.toString();
    }

    public String createSpaces(int numSpaces) {
        StringBuilder spaceString = new StringBuilder();
        
        for (int spaceIndex = 0; spaceIndex < numSpaces; spaceIndex++ ) {
            spaceString.append(' ');
        }

        return spaceString.toString();
    }

    public static void main(String[] args) {
        DiamondPrinter test = new DiamondPrinter();
        for (String row : test.printToList('Z')) {
            System.out.println(row);
        }
	}
}