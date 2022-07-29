public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int minutesInOvenSoFar) {
        return (this.expectedMinutesInOven() - minutesInOvenSoFar);
    }

    public int preparationTimeInMinutes(int numberOfLayers) {
        return (numberOfLayers * 2);
    }

    public int totalTimeInMinutes(int numberOfLayers, int minutesInOvenSoFar) {
        return (this.preparationTimeInMinutes(numberOfLayers) + minutesInOvenSoFar);
    }


}
