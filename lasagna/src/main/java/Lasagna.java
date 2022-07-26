public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int minutesInOven) {
        Lasagna lasagna = new Lasagna();
        int minutesRemaining = lasagna.expectedMinutesInOven() - minutesInOven;
        return minutesRemaining;
    }

    // TODO: define the 'preparationTimeInMinutes()' method

    // TODO: define the 'totalTimeInMinutes()' method
}
