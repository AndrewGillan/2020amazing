package na.ac.eit.amazingtranslator;

import java.util.ArrayList;
import java.util.List;

public class TranslationDictionaries {
    private List<String> frenchTranslations = new ArrayList<>();
    private List<String> germanTranslations = new ArrayList<>();


    public int initializeDictionaries() {


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
        return frenchTranslations.size();


    }


    public String getTranslationOf(int number, int languageOption) throws LanguageNotSupportedException,NumberOutOfRangeException {

        if (number < 1 || number > 30) {
            throw new NumberOutOfRangeException();

        }




        if (languageOption == 1) {
            return frenchTranslations.get(number - 1);
        }
        else if (languageOption == 2) {
            return germanTranslations.get(number - 1);
        }
        else {

            throw new LanguageNotSupportedException();
        }
    }



}
