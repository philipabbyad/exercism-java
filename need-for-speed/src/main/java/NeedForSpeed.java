class NeedForSpeed {
    
    private int speed;
    private int batteryDrain;
    private int distanceDriven;
    private int batteryPercentageRemaining = 100;

    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        throw new UnsupportedOperationException("Please implement the NeedForSpeed.batteryDrained() method");
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        distanceDriven += speed;
        batteryPercentageRemaining -= batteryDrain;

    }

    public static NeedForSpeed nitro() {
        throw new UnsupportedOperationException("Please implement the (static) NeedForSpeed.nitro() method");
    }
}

class RaceTrack {
    
    private int distance;

    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        throw new UnsupportedOperationException("Please implement the RaceTrack.tryFinishTrack() method");
    }
}
