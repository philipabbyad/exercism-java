import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        boolean isLanguageListEmpty = (languages.size() == 0);
        return isLanguageListEmpty;
    }

    public void addLanguage(String language) {
        languages.add(language);
    }

    public void removeLanguage(String language) {
        languages.remove(language);
    }

    public String firstLanguage() {
        String firstLanguage = languages.get(0);
        return firstLanguage;
    }

    public int count() {
        int languageCount = languages.size();
        return languageCount;
    }

    public boolean containsLanguage(String language) {
        boolean containsLanguage = false;
        for (String languageInList : languages) {
            if (languageInList == language) {
                containsLanguage = true;
                break;
            }
        }
        return containsLanguage;
    }

    public boolean isExciting() {
        boolean isLanguageListExciting = false;
        for (String languageInList : languages) {
            if (languageInList == "Java" || languageInList == "Kotlin") {
                isLanguageListExciting = true;
                break;
            }
        }
        return isLanguageListExciting;
    }
}