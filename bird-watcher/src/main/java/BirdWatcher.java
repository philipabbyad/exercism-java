
class BirdWatcher {
    private final int[] birdsPerDay;

    private final int lastWeekCount[] = {0, 2, 5, 3, 7, 8, 4};

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return lastWeekCount;
    }

    public int getToday() {
        int birdCountToday = 0;
        if (birdsPerDay.length > 0) {
            birdCountToday = birdsPerDay[birdsPerDay.length - 1];
        }
        return birdCountToday;
    }

    public void incrementTodaysCount() {
        throw new UnsupportedOperationException("Please implement the BirdCount.incrementTodaysCount() method");
    }

    public boolean hasDayWithoutBirds() {
        throw new UnsupportedOperationException("Please implement the BirdCount.hasDayWithoutBirds() method");
    }

    public int getCountForFirstDays(int numberOfDays) {
        throw new UnsupportedOperationException("Please implement the BirdCount.getCountForFirstDays() method");
    }

    public int getBusyDays() {
        throw new UnsupportedOperationException("Please implement the BirdCount.getBusyDays() method");
    }
}
