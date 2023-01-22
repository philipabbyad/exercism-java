class RaindropConverter {

    String convert(int number) {
        String rainDropSounds = "";

        if (number % 3 == 0) {
            rainDropSounds += "Pling";
        }

        if (number % 5 == 0) {
            rainDropSounds += "Plang";
        }

        if (number % 7 == 0) {
            rainDropSounds += "Plong";
        }

        if (rainDropSounds.isEmpty()) {
            rainDropSounds = Integer.toString(number);
        }

        return rainDropSounds;
    }
}