import java.util.ArrayList;
import java.util.List;

public class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(ProductionRemoteControlCar prc1,
                                                                 ProductionRemoteControlCar prc2) {
        List<ProductionRemoteControlCar> rankedCarsList = new ArrayList<>();
        if (prc1.compareTo(prc2) >= 0) {
            rankedCarsList.add(prc2);
            rankedCarsList.add(prc1);
        } else {
            rankedCarsList.add(prc1);
            rankedCarsList.add(prc2);
        }
        return rankedCarsList;
    }
}
