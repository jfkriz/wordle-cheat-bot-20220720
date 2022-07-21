import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Kata {
    private String[] wordList;

    public String hello(String name) {
        return String.format("Hello %s", name);
    }

    public Kata (String[] wordlist){
        this.wordList = wordlist;
    }

    public String[] checkLastGuess(String guess, String hint){
        if (hint == "GGGGG"){
            return new String[]{guess};
        } else if (hint == "GGGG-"){
            String fourGreen = guess.substring(0,4);
            List<String> possibleWords = new ArrayList<>();
            for(int i = 0; i < wordList.length; i++){
                if (wordList[i].startsWith(fourGreen) && wordList[i] != guess){
                    possibleWords.add(wordList[i]);
                }
            } return possibleWords.toArray(new String[possibleWords.size()]);

        } else if (hint.indexOf("-") >= 0 && hint.indexOf("-") == hint.lastIndexOf("-")){
            int dashIndex = hint.indexOf("-");
            String beforeDash = guess.substring(0, dashIndex);
            String afterDash = guess.substring(dashIndex + 1);
            List<String> possibleWords = new ArrayList<>();
            for(int i = 0; i < wordList.length; i++) {
                if (wordList[i].matches(beforeDash + "." + afterDash) && wordList[i] != guess){
                    possibleWords.add(wordList[i]);
                }
            }return possibleWords.toArray(new String[possibleWords.size()]);

        } else if (hint.chars().filter(ch -> ch == '-').count() == 2) {
        }
        return null;
    }
}
