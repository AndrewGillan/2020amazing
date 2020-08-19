package na.ac.eit.amazingtranslator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<String> frenchTranslations=new ArrayList<>();
        frenchTranslations.add("Un");
        frenchTranslations.add("Deux");
        frenchTranslations.add("Trois");
        frenchTranslations.add("Quatre");
        frenchTranslations.add("Cinq");
        frenchTranslations.add("Six");
        frenchTranslations.add("Sept");
        frenchTranslations.add("Huit");
        frenchTranslations.add("Nuef");
        frenchTranslations.add("Dix");
        frenchTranslations.add("Onze");
        frenchTranslations.add("Douze");
        frenchTranslations.add("Treize");
        frenchTranslations.add("Quatorze");
        frenchTranslations.add("Quinze");
        frenchTranslations.add("Seize");
        frenchTranslations.add("Dix-Sept");
        frenchTranslations.add("Dix-Huit");
        frenchTranslations.add("Dix-Nuef");
        frenchTranslations.add("Vingt");
        frenchTranslations.add("Vingt et un");
        frenchTranslations.add("Vingt-deux");
        frenchTranslations.add("Vingt-trois");
        frenchTranslations.add("Vingt-quatre");
        frenchTranslations.add("Vingt-cinq");
        frenchTranslations.add("Vingt-six");
        frenchTranslations.add("Vingt-sept");
        frenchTranslations.add("Vingt-huit");
        frenchTranslations.add("Vingt-neuf");
        frenchTranslations.add("Trente");
        //Finish This

        List<String> germanTranslations=new ArrayList<>();
        germanTranslations.add("Eiz");
        germanTranslations.add("Zwei");
        germanTranslations.add("Drei");
        germanTranslations.add("Vier");
        germanTranslations.add("Funf");
        germanTranslations.add("Sechs");
        germanTranslations.add("Sieben");
        germanTranslations.add("Acht");
        germanTranslations.add("Neun");
        germanTranslations.add("Zehn");
        germanTranslations.add("Elf");
        germanTranslations.add("Zwolf");
        germanTranslations.add("Dreizehn");
        germanTranslations.add("Vierzhen");
        germanTranslations.add("Funfzehn");
        germanTranslations.add("Sechzhen");
        germanTranslations.add("Siebzhen");
        germanTranslations.add("Achtzhen");
        germanTranslations.add("Neunzehn");
        germanTranslations.add("Zwanzig");
        germanTranslations.add("Einundzwanzig");
        germanTranslations.add("Zweiundzwanzig");
        germanTranslations.add("Dreiundzwanzig");
        germanTranslations.add("Vierundzwanzig");
        germanTranslations.add("Funfundzwanzig");
        germanTranslations.add("Sechsundzwanzig");
        germanTranslations.add("Siebenundzwanzig");
        germanTranslations.add("Achtundzwanzig");
        germanTranslations.add("Neunundzwanzig");
        germanTranslations.add("Dreibig");
        //Finish This

        String userAnswer=null;

        do
        {

            System.out.println("Provide a number from 1-30");
            Scanner scanner = new Scanner(System.in);
            String NumberAsaString = scanner.nextLine();

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

            if (option == 1) {
                System.out.println(frenchTranslations.get(number - 1));
            } else if (option == 2) {
                System.out.println(germanTranslations.get(number - 1));
            } else {
                System.out.println("Only French or German");
            }

            // restart & Quit
            System.out.println("Would you like to use this program again? (Y or N)");
            userAnswer=scanner.nextLine();
        }
        while (userAnswer.equalsIgnoreCase("Y"));







    }
}

