class NeedForSpeed {
    
    private int speed;
    private int batteryDrainPercentage;
    private int distanceDriven;
    private int batteryPercentageRemaining = 100;

    public NeedForSpeed(int speed, int batteryDrainPercentage) {
        this.speed = speed;
        this.batteryDrainPercentage = batteryDrainPercentage;
    }

    public boolean batteryDrained() {
        boolean isBatteryDrained = (batteryPercentageRemaining < batteryDrainPercentage); 
        return isBatteryDrained;
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if (!this.batteryDrained()) {
            distanceDriven += speed;
            batteryPercentageRemaining -= batteryDrainPercentage;
        }

    }

    public static NeedForSpeed nitro() {
        NeedForSpeed nitroCar = new NeedForSpeed(50, 4);
        return nitroCar;
    }
}

class RaceTrack {
    
    private int distance;

    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        boolean canCarFinishTrack = false;
        int trackDistanceRemaining = distance;
        while ((trackDistanceRemaining - car.distanceDriven()) > 0) {
            car.drive();
            if (car.batteryDrained()) {
                break;
            }
        }
        if (trackDistanceRemaining <= 0) {
            canCarFinishTrack = true;
        }
        return canCarFinishTrack;
    }
}