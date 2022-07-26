public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int minutesInOvenSoFar) {
        Lasagna lasagna = new Lasagna();
        return (lasagna.expectedMinutesInOven() - minutesInOvenSoFar);
    }

    public int preparationTimeInMinutes(int numberOfLayers) {
        return (numberOfLayers * 2);
    }

    public int totalTimeInMinutes(int numberOfLayers, int minutesInOvenSoFar) {
        Lasagna lasagna = new Lasagna();
        return (lasagna.preparationTimeInMinutes(numberOfLayers) + minutesInOvenSoFar);
    }


}
