package assignment.Day7;

public class VowelCounter {
    public static void main(String[] args) {

        String sentence = new String("My name is Sanjina Shakya");

        //convert sentence into char array
        //char[] sentenceAsChar = new char[sentence.length()];
        char[] sentenceAsChar = sentence.toCharArray();

        int counter = 0;
        for (int i=0; i < sentenceAsChar.length; i++){
            if(sentenceAsChar[i] == 'a' || sentenceAsChar[i] == 'e' || sentenceAsChar[i] == 'i' || sentenceAsChar[i] == 'o' || sentenceAsChar[i] == 'u' ){
                counter ++;
            }
        }

        System.out.println(counter);
    }
}
