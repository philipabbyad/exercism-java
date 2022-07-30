class SqueakyClean {
    private static String cleanIdentifier;

    static String clean(String identifier) {
        cleanIdentifier = identifier;
        if (identifier.contains(" ")) {
            cleanIdentifier =  identifier.replace(' ', '_');
        }
    return cleanIdentifier;
    }
}
