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
        while (((distance - car.distanceDriven())) > 0 && !car.batteryDrained()) {
            car.drive();
        }
        boolean canCarFinishTrack = car.distanceDriven() >= distance;
        return canCarFinishTrack;
    }
}