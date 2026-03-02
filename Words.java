//1- Using overloading concept, WAP to create a class “Words” having some methods with the same name.
//All methods accept string type values as their parameters. Provide the user with a menu as under, 
//and based on the user’s choice input appropriate data and do what she/he has asked for.
//When comparing, ignore repeated characters.

import java.util.ArrayList;
import java.util.Scanner;

public class Words{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please select an option\n1. Convert a string to all lower case\n2. Show common characters between two strings\n3. Show uncommon characters between 3 strings\n> ");
        switch (input.nextInt()) {
            case 1:
                input.nextLine();
                System.out.print("Please enter the string to convert\n> ");
                System.out.println("String converted to lower case:\n"+action(input.nextLine()));
                break;
            case 2:
                System.out.print("Please enter the first word\n> ");
                String word1=input.next();
                System.out.print("Please enter the second word\n> ");
                System.out.println(action(word1,input.next()));
                break;
            case 3:
                ArrayList<String> words=new ArrayList<>();
                System.out.print("Please enter the first word\n> ");
                words.add(input.next());
                System.out.print("Please enter the second word\n> ");
                words.add(input.next());
                System.out.print("Please enter the third word\n> ");
                words.add(input.next());
                System.out.println(action(words));
                break;
            default:
                System.out.println("Invalid option!");
        }
        input.close();
    }
    private static String action(String phrase){
        return phrase.toLowerCase();
    }
    private static String action(String word1,String word2){
        String commonLetters="";
        for(int i=0;i<word1.length();++i){
            for(int j=0;j<word2.length();++j){
                if((word1.charAt(i)==word2.charAt(j))&&(!commonLetters.contains(word1.charAt(i)+"")))commonLetters+=word1.charAt(i)+" ";
            }
        }
        return"Common characters: "+commonLetters;
    }
    private static String action(ArrayList<String> words){
        String answer="Uncommon characters: ";
        String letters="";
        for(String word:words){
            char[] lettersInWord=word.trim().toLowerCase().toCharArray();
            for(int i=0;i<lettersInWord.length;++i){
                letters+=lettersInWord[i];
            }
        }
        String commonLetters="";
        for(int letterPointer=97;letterPointer<=122;++letterPointer){
            int commonFlag=0;
            for(String word:words){
                if(!word.contains((char)letterPointer+""))++commonFlag;
            }
            if(commonFlag<2)commonLetters+=(char)letterPointer;
        }
        for(int letterPointer=97;letterPointer<=122;++letterPointer){
            if((!commonLetters.contains((char)letterPointer+""))&&(letters.contains((char)letterPointer+"")))answer+=(char)letterPointer+" ";
        }
        return answer;
    }
}