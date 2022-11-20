public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double productionRate = speed * 221;

        if (speed <= 0) {
            productionRate *= 0;
        } else if (speed >= 1 && speed <= 4) {
            productionRate *= 1;
        } else if (speed >= 5 && speed <= 8) {
            productionRate *= .9;
        } else if (speed == 9) {
            productionRate *= .8;
        } else {
            productionRate *= .77;
        }
        return productionRate;
    }

    public int workingItemsPerMinute(int speed) {
        int itemsPerMinute = (int)(this.productionRatePerHour(speed) / 60);
        return itemsPerMinute;
    }
}
