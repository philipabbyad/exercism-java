import java.lang.reflect.Array;
import java.util.ArrayList;

class SqueakyClean {
    private static String cleanIdentifier;

    static String clean(String identifier) {
        cleanIdentifier = identifier;

        if (identifier.contains(" ")) {
            cleanIdentifier =  identifier.replace(' ', '_');
        }

//        while (identifier.contains("")) {
//            cleanIdentifier = identifier.replaceAll("I", "CTRL");
//        }

//        cleanIdentifier = identifier.replaceAll("[\\p{Cntrl}]", "CTRL");
        cleanIdentifier = identifier.replaceAll("[\u0000-\u001F\u007F-\u009F]", "CTRL");


    return cleanIdentifier;
    }
}
