import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Scrabble {

    private String word = "";

    private static final HashMap<List<Character>, Integer> SCRABBLE_LETTER_VALUES = new HashMap<>();

    static {
        SCRABBLE_LETTER_VALUES.put(Arrays.asList('A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T'), 1);
        SCRABBLE_LETTER_VALUES.put(Arrays.asList('D', 'G'), 2);
        SCRABBLE_LETTER_VALUES.put(Arrays.asList('B', 'C', 'M', 'P'), 3);
        SCRABBLE_LETTER_VALUES.put(Arrays.asList('F', 'H', 'V', 'W', 'Y'), 4);
        SCRABBLE_LETTER_VALUES.put(Arrays.asList('K'), 5);
        SCRABBLE_LETTER_VALUES.put(Arrays.asList('J', 'X'), 8);
        SCRABBLE_LETTER_VALUES.put(Arrays.asList('Q', 'Z'), 10);
    }

    public Scrabble(String word) {
        this.word = word;
    }

    int getScore() {
        int wordScore = 0;
        char[] wordCharacterArray = this.word.toUpperCase().toCharArray();
        for (char wordCharacter : wordCharacterArray) {
            for (HashMap.Entry<List<Character>, Integer> scrabbleLetterValue : SCRABBLE_LETTER_VALUES.entrySet()) {
                if (scrabbleLetterValue.getKey().contains(wordCharacter)) {
                    wordScore += scrabbleLetterValue.getValue();
                    break;
                }
            }
        }
        return wordScore;
    }

}