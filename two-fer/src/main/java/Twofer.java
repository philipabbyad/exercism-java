import static java.lang.String.format;

public class Twofer {
    public String twofer(String name) {
        if (name == null) {
            return format("One for you, one for me.");
        } else {
            return format("One for %s, one for me.", name);
        }

    }

}
