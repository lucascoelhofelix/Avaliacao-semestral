public class AggressiveRiskStrategy implements RiskStrategy {

    @Override
    public double calculateRisk(ClientData data) {
        return (data.getInvestments() * 0.7)
                - (data.getAge() * 0.2)
                + (data.getVolatilityTolerance() * 1.5);
    }
}
