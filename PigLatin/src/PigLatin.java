import java.util.Scanner;

public class PigLatin {

       public static void main(String[] args) {
             // TODO Auto-generated method stub
       System.out.println("Enter an English word.");
       Scanner reader = new Scanner(System.in);
       String word = reader.nextLine();
       String translation = checkWord(word);
       reader.close();
       System.out.println("The pig latin word for this is: " + translation);
       }
    
    public static String checkWord(String word) {
       
       char[] vowels  = {'a','e','i','o','u'};
       char firstLetter = word.charAt(0);
       
       //Check if first letter is a vowel
       for (int i=0; i<vowels.length; i++) {
             if (firstLetter == vowels[i]) {
                    return word + "yay";
             }
       }
       
       //consonant is the first letter but has a vowel
       for (int j=0; j<vowels.length; j++) {
             for(int i=0; i<vowels.length; i++)
             if (word.charAt(j) == vowels[i]) {
                    String afterVowel = word.substring(j, word.length());
                    String beforeVowel = word.substring(0, j);
                    return afterVowel + beforeVowel + "ay";
             }
       }
       
       //word has no vowel
       return word + "ay";
    }
    
}

		
	    
	    

	


