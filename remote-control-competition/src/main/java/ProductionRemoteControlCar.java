class ProductionRemoteControlCar implements RemoteControlCar, Comparable {
    private int distanceTravelled = 0;
    private int numberofVictories = 0;

    @Override
    public int compareTo(Object o) {
        ProductionRemoteControlCar compareCar = (ProductionRemoteControlCar) o;
        return this.getNumberOfVictories() - compareCar.getNumberOfVictories();
    }

    public void drive() {
        distanceTravelled += 10;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;     
    }

    public int getNumberOfVictories() {
        return numberofVictories;
    }

    public void setNumberOfVictories(int numberofVictories) {
        this.numberofVictories = numberofVictories;
    }
}