public class ClientData {
    private double income;
    private double investments;
    private int age;
    private double volatilityTolerance;

    public ClientData(double income, double investments, int age, double volatilityTolerance) {
        this.income = income;
        this.investments = investments;
        this.age = age;
        this.volatilityTolerance = volatilityTolerance;
    }

    public double getIncome() { return income; }
    public double getInvestments() { return investments; }
    public int getAge() { return age; }
    public double getVolatilityTolerance() { return volatilityTolerance; }
}
