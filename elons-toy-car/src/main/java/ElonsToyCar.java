public class ElonsToyCar {

    private int distanceDriven = 0;
    private int batteryPercentageRemaining = 100;


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
            distanceDriven += 20;
            batteryPercentageRemaining -= 1;
        }
    }
}