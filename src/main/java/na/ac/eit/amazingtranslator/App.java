package na.ac.eit.amazingtranslator;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       TranslationDictionaries dictionaries = new TranslationDictionaries();
       dictionaries.initializeDictionaries();

        String userAnswer=null;



        do
        {



            Integer number = null;
            //System.out.println(NumberAsaString);
            try {
                number = Integer.parseInt(NumberAsaString);
                System.out.println(number);
            } catch (NumberFormatException nfe) {
                System.out.println("You have entered a number outside of the requirements");
                System.exit(0);
            }


            System.out.println("Which language would you like to translate your number to? (1-French, 2-German)");
            String OptionAsString = scanner.nextLine();


            Integer option = null;
            try {
                option = Integer.parseInt(OptionAsString);
                System.out.println(option);
            } catch (NumberFormatException nfe) {
                System.out.println("Available options are numeric");
                System.exit(0);
            }

            //Check that the option is 1 or 2


            try {
                System.out.println(dictionaries.getTranslationOf(number, option));
            } catch (LanguageNotSupportedException e) {
                System.out.println("only French and German are supported");
            } catch (NumberOutOfRangeException e) {
                System.out.println("Only numbers between 1-30");
            }

            // restart & Quit
            System.out.println("Would you like to use this program again? (Y or N)");
            userAnswer=scanner.nextLine();
        }
        while (userAnswer.equalsIgnoreCase("Y"));


        }







    }
}

