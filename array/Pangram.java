package array;

public class Pangram {
    public static void main(String[] args) {
        String sentence1 = "qwertyuioplkjhgfdsazxccbvnbmkdfhdvoi";
        String sentence2 = "udjaovuenalvirhwqosdcnhfoaf";
        System.out.println("Sentence1 is " + checkIfSentenceisPangram(sentence1));
        System.out.println("Sentence2 is " + checkIfSentenceisPangram(sentence2));
    }

    // sentence is pangram if it contains all alphabets
    public static String checkIfSentenceisPangram(String s) {
        if (s.length() < 26) {
            return "not a pangram.";
        }
        char a = 'a';
        for (int i = 0; i < 26; i++) {
            if (s.contains(String.valueOf(a))) {
                a++;
            } else {
                return "not a pangram.";
            }
        }
        return "a pangram.";
    }
}
