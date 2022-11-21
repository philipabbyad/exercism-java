public class SalaryCalculator {
    public double multiplierPerDaysSkipped(int daysSkipped) {
        double multiplier = (daysSkipped <= 5) ? 1 : 0.85;
        return multiplier;
    }

    public int multiplierPerProductsSold(int productsSold) {
        int multiplier = (productsSold <= 20) ? 10 : 13;
        return multiplier;
    }

    public double bonusForProductSold(int productsSold) {
        throw new UnsupportedOperationException("Please implement the SalaryCalculator.bonusForProductSold() method");
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        throw new UnsupportedOperationException("Please implement the SalaryCalculator.finalSalary() method");
    } 
}
