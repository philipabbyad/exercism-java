import java.util.ArrayList;
import java.util.List;

class DiamondPrinter {
    private int letterAlphabetPosition = 0;
    private int numRows = 0;
    private List<String> diamondOutput = new ArrayList<String>();

    public List<String> printToList(char letter) {

        if (!Character.isLetter(letter)) { // Only letters are expected in the input
            throw new IllegalArgumentException("Must enter a single letter A-Z");
        }

        letterAlphabetPosition = Character.toUpperCase(letter) - 64; // Normalize case needed for alphabet position based on ASCII
        numRows = (letterAlphabetPosition * 2) - 1;

        diamondOutput.add(createSingleLetterRowWithLetterA());

        // Top half: ascend from B to the widest letter
        for (int rowNum = 2; rowNum <= ((numRows + 1) / 2); rowNum++) {
            diamondOutput.add(createRowWithAnyOtherLetter(rowNum));
        }

        // Bottom half: descend back to B (mirrors top half for vertical symmetry)
        for (int rowNum = (((numRows + 1) / 2) - 1); rowNum >= 2; rowNum--) {
            diamondOutput.add(createRowWithAnyOtherLetter(rowNum));
        }

        if (numRows > 1) {
            diamondOutput.add(createSingleLetterRowWithLetterA());
        }

        return diamondOutput;
    }

    public String createSingleLetterRowWithLetterA() {
        StringBuilder rowOutput = new StringBuilder();

        rowOutput.append(createSpaces(this.letterAlphabetPosition - 1));
        rowOutput.append('A');
        rowOutput.append(createSpaces(this.letterAlphabetPosition - 1));

        return rowOutput.toString();
    }

    public String createRowWithAnyOtherLetter(int rowNum) {
        StringBuilder rowOutput = new StringBuilder();
        char rowLetter = Character.toChars(rowNum + 64)[0];

        rowOutput.append(createSpaces(this.letterAlphabetPosition - rowNum));
        rowOutput.append(rowLetter);
        rowOutput.append(createSpaces((rowNum * 2) - 3));
        rowOutput.append(rowLetter);
        rowOutput.append(createSpaces(this.letterAlphabetPosition - rowNum));

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