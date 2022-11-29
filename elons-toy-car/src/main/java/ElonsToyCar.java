public class ElonsToyCar {

    private int distanceDriven;
    private int batteryPercentageRemaining;
    private static final int DISTANCE_EACH_DRIVE = 20;
    private static final int BATTERY_PERCENTAGE_DRAIN_EACH_DRIVE = 1;

    public ElonsToyCar() {
        this.distanceDriven = 0;
        this.batteryPercentageRemaining = 100;
    }

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        String distanceDisplayMessage = "Driven " + distanceDriven + " meters";
        return distanceDisplayMessage;
    }

    public String batteryDisplay() {
        String batteryDisplayMessage = (batteryPercentageRemaining < 1) ? "Battery empty" : "Battery at " + batteryPercentageRemaining + "%";
        return batteryDisplayMessage;
    }

    public void drive() {
        if (batteryPercentageRemaining >= 1) {
            distanceDriven += DISTANCE_EACH_DRIVE;
            batteryPercentageRemaining -= BATTERY_PERCENTAGE_DRAIN_EACH_DRIVE;
        }
    }
}