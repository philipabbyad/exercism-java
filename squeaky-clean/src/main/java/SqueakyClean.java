class SqueakyClean {
    private static String cleanIdentifier;

    static String clean(String identifier) {
        cleanIdentifier = identifier;

        // 1) Replace blank space with underscores:
        if (identifier.contains(" ")) {
            cleanIdentifier =  cleanIdentifier.replace(' ', '_');
        }

        // 2) Remove Control Characters:
        for (int i = 0; i < cleanIdentifier.length(); i++) {
            int codePoint = cleanIdentifier.codePointAt(i);
            if ((codePoint >= 0 && codePoint <= 31) || codePoint == 127) {
                cleanIdentifier = cleanIdentifier.substring(0, i) + "CTRL" + cleanIdentifier.substring(i +1);
            }
        }

        // 3) Convert kebab-case to camelCase
        while (cleanIdentifier.indexOf('-') != -1) {
            int index = cleanIdentifier.indexOf('-');
            cleanIdentifier = cleanIdentifier.substring(0, index) + cleanIdentifier.substring(index + 1, index + 2).toUpperCase() + cleanIdentifier.substring(index + 2);
        }


        // 4+5) Omit characters that are not letters and Greek letters in the range 'α' to 'ω'
        char[] cleanIdentifierCharArray = cleanIdentifier.toCharArray();
        StringBuilder cleanIdentifierStringBuilder = new StringBuilder();

        for (char ch : cleanIdentifierCharArray) {
            if ((Character.isLetter(ch) || ch == '_') && (ch < 'α' || ch > 'ω')) {
                cleanIdentifierStringBuilder.append(ch);
            }
        }
        cleanIdentifier = cleanIdentifierStringBuilder.toString();

    return cleanIdentifier;
    }
}
