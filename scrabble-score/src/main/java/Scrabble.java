import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Scrabble {

    private String word = "";

    HashMap<List<Character>, Integer> scrabbleLetterValues = new HashMap<>();

    public Scrabble(String word) {
        this.word = word;
        scrabbleLetterValues.put(Arrays.asList('A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T'), 1);
        scrabbleLetterValues.put(Arrays.asList('D', 'G'), 2);
        scrabbleLetterValues.put(Arrays.asList('B', 'C', 'M', 'P'), 3);
        scrabbleLetterValues.put(Arrays.asList('F', 'H', 'V', 'W', 'Y'), 4);
        scrabbleLetterValues.put(Arrays.asList('K'), 5);
        scrabbleLetterValues.put(Arrays.asList('J', 'X'), 8);
        scrabbleLetterValues.put(Arrays.asList('Q', 'Z'), 10);
    }

    int getScore() {
        int wordScore = 0;
        return wordScore;
    }

}
