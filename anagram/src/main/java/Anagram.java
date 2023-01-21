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
        HashMap<Character, Integer> letterCountOfWordToTest = createMapOfLetters(wordToTest.toUpperCase().toCharArray());

        for (String wordToTestAgainst : wordListToTestAgainst) {
            HashMap<Character, Integer> letterCountOfWordToTestAgainst = createMapOfLetters(wordToTestAgainst.toUpperCase().toCharArray());
            if (letterCountOfWordToTest.equals(letterCountOfWordToTestAgainst) && !wordToTest.toUpperCase().equals(wordToTestAgainst.toUpperCase())) {
                anagramMatches.add(wordToTestAgainst);
            }
        }
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
        System.out.println(test.match(Arrays.asList("stream", "pigeon", "snOw", "maters", "owns")));
    }
}