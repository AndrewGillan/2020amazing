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
        //Finish This

        List<String> germanTranslations=new ArrayList<>();
        frenchTranslations.add("Eiz");
        frenchTranslations.add("Zwei");
        frenchTranslations.add("Drei");
        //Finish This





        System.out.println( "What is the number you want to translate" );
        Scanner scanner=new Scanner(System.in);
        String NumberAsaString=scanner.nextLine();

        Integer number=null;
        //System.out.println(NumberAsaString);
        try {
             number = Integer.parseInt(NumberAsaString);
            System.out.println(number);
        }
        catch(NumberFormatException nfe){
            System.out.println("The number has to be a numeric");
            System.exit(0);
        }


        System.out.println("What is the language to be used (1-French, 2-German");
        String OptionAsString=scanner.nextLine();


        Integer option=null;
        try {
             option = Integer.parseInt(OptionAsString);
            System.out.println(option);
        }
        catch(NumberFormatException nfe) {
            System.out.println("Available options are numeric");
            System.exit(0);
        }

        //Check that the option is 1 or 2

        if(option==1){
            System.out.println(frenchTranslations.get(number-1));
        }
        else if(option==2){
            System.out.println(germanTranslations.get(number-1));
        }
        else {
            System.out.println("Only French or German");
        }








    }
}
