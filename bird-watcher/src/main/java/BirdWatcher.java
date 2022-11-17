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
        if (birdsPerDay.length > 0) {
            birdsPerDay[birdsPerDay.length - 1]++;
        }
    }

    public boolean hasDayWithoutBirds() {
        boolean isThereDayWithoutBirds = false;
        if (birdsPerDay.length == 0) {
            isThereDayWithoutBirds = true;
        } else {
            for (int dayCount : birdsPerDay) {
                if (dayCount == 0) {
                    isThereDayWithoutBirds = true;
                }
            }
        }
        return isThereDayWithoutBirds;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int countForFirstDays = 0;
        if (numberOfDays > birdsPerDay.length) {
            for (int daysCount : birdsPerDay) {
                countForFirstDays += daysCount;
            }
        } else {
            for (int dayIndex = 0; dayIndex < numberOfDays; dayIndex++) {
                countForFirstDays += birdsPerDay[dayIndex];
            }
        }
        return countForFirstDays;
    }

    public int getBusyDays() {
        int numberOfBusyDays = 0;
        for (int daysCount : birdsPerDay) {
            if (daysCount >= 5) {
                numberOfBusyDays++;
            }
        }
        return numberOfBusyDays;
    }
}