public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double productionRate = speed * 221;

        if (speed >= 5 && speed <= 8) {
            productionRate *= .9;
        } else if (speed == 9) {
            productionRate *= .8;
        } else if (speed >= 10) {
            productionRate *= .77;
        }
        return productionRate;
    }

    public int workingItemsPerMinute(int speed) {
        throw new UnsupportedOperationException("Please implement the CarsAssemble.workingItemsPerMinute() method");
    }
}
