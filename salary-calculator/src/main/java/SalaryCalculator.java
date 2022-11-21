public class SalaryCalculator {
    public double multiplierPerDaysSkipped(int daysSkipped) {
        double multiplier = (daysSkipped <= 5) ? 1 : 0.85;
        return multiplier;
    }

    public int multiplierPerProductsSold(int productsSold) {
        throw new UnsupportedOperationException("Please implement the SalaryCalculator.multiplierPerProductsSold() method");
    }

    public double bonusForProductSold(int productsSold) {
        throw new UnsupportedOperationException("Please implement the SalaryCalculator.bonusForProductSold() method");
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        throw new UnsupportedOperationException("Please implement the SalaryCalculator.finalSalary() method");
    } 
}
