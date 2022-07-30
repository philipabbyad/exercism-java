import java.lang.reflect.Array;
import java.util.ArrayList;

class SqueakyClean {
    private static String cleanIdentifier;

    static String clean(String identifier) {
        cleanIdentifier = identifier;

        //Replace blank space with underscores:

        if (identifier.contains(" ")) {
            cleanIdentifier =  cleanIdentifier.replace(' ', '_');
        }

        //Remove Control Characters:

//        cleanIdentifier = cleanIdentifier.replaceAll("[\\p{Cntrl}]", "CTRL");
//          OR
//        cleanIdentifier = cleanIdentifier.replaceAll("[\u0000-\u001F\u007F]", "CTRL");
//          OR

        for (int i = 0; i < cleanIdentifier.length(); i++) {
            int codePoint = cleanIdentifier.codePointAt(i);
            if ((codePoint >= 0 && codePoint <= 31) || codePoint == 127) {
                cleanIdentifier = cleanIdentifier.substring(0, i) + "CTRL" + cleanIdentifier.substring(i +1);
            }
        }




    return cleanIdentifier;
    }
}
