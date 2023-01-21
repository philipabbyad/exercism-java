import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Anagram {

    private String wordToTest = "";

    public Anagram(String wordToTest) {
        this.wordToTest = wordToTest;
    }

    public List<String> match(List<String> wordListToTestAgainst) {
        List<String> anagramMatches = new ArrayList<>();
        HashMap<Character, Integer> letterCountWordToTest = createMapOfLetters(wordToTest.toCharArray());

        for (String wordToTestAgainst : wordListToTestAgainst) {
            HashMap<Character, Integer> letterCountWordToTestAgainst = createMapOfLetters(wordToTestAgainst.toCharArray());
            if (letterCountWordToTest.equals(letterCountWordToTestAgainst)) {
                anagramMatches.add(wordToTestAgainst);
            }
        }
        System.out.println(letterCountWordToTest);
        return anagramMatches;
    }

    public HashMap<Character, Integer> createMapOfLetters (char[] lettersInWord) {
        HashMap<Character, Integer> letterCountMap = new HashMap<>();
        for (char letter : lettersInWord) {
            if (!letterCountMap.containsKey(letter)){
                letterCountMap.put(letter, 1);
            } else {
                letterCountMap.replace(letter, letterCountMap.get(letter) + 1);
            }
        }
        return letterCountMap;
    }

    public static void main(String[] args) {
        Anagram test = new Anagram("owns");
        System.out.println(test.match(Arrays.asList("stream", "pigeon", "snow", "maters")));
    }

}