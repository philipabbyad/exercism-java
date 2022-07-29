public class Lasagna {

    private static final int TOTAL_OVEN_TIME_MINUTES = 40;
    private static final int LAYER_PREP_TIME_MINUTES = 2;

    public int expectedMinutesInOven() {
        return TOTAL_OVEN_TIME_MINUTES;
    }

    public int remainingMinutesInOven(int minutesInOvenSoFar) {
        return (this.expectedMinutesInOven() - minutesInOvenSoFar);
    }

    public int preparationTimeInMinutes(int numberOfLayers) {
        return (numberOfLayers * LAYER_PREP_TIME_MINUTES);
    }

    public int totalTimeInMinutes(int numberOfLayers, int minutesInOvenSoFar) {
        return (this.preparationTimeInMinutes(numberOfLayers) + minutesInOvenSoFar);
    }


}
