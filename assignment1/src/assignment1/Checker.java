package assignment1;



//C. Check if the input is pangram or not. (Pangram is a sentence that contains all the alphabet
//from a-z)

public class Checker {
	
	public static boolean isPangram(String sentence) {
        sentence = sentence.toLowerCase();

        for (char c = 'a'; c <= 'z'; c++) {
            if (sentence.indexOf(c) == -1) {
                return false;
            }
        }

        return true;
    }
	
	public static void main(String[] args) {
        String sentence = "hello world, Java is awesome"; // Input your sentence here
        if (isPangram(sentence)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

}
