public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int minutesInOven) {
        Lasagna lasagna = new Lasagna();
        return (lasagna.expectedMinutesInOven() - minutesInOven);
    }

    public int preparationTimeInMinutes(int layers) {
        return (layers * 2);
    }

    // TODO: define the 'totalTimeInMinutes()' method
}
