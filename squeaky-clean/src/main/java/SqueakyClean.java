class SqueakyClean {
    private static String cleanIdentifier;


    static String clean(String identifier) {

        cleanIdentifier = identifier.replaceAll(" ", "_");

        while (cleanIdentifier.indexOf('-') != -1) {
            int index = cleanIdentifier.indexOf('-');
            cleanIdentifier = cleanIdentifier.substring(0, index) + cleanIdentifier.substring(index + 1, index + 2).toUpperCase() + cleanIdentifier.substring(index + 2);
        }

        char[] cleanIdentifierCharArray = cleanIdentifier.toCharArray();
        StringBuilder cleanIdentifierStringBuilder = new StringBuilder();
        
        for (char ch : cleanIdentifierCharArray) {
            if ((Character.isLetter(ch) || ch == '_') && (ch < 'α' || ch > 'ω')) {
                cleanIdentifierStringBuilder.append(ch);
            } else if ((ch >= 0 && ch <= 31) || ch == 127) {
                cleanIdentifierStringBuilder.append("CTRL");
            }
        }
        cleanIdentifier = cleanIdentifierStringBuilder.toString();

    return cleanIdentifier;
    }
}