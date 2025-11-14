public class ModerateRiskStrategy implements RiskStrategy {

    @Override
    public double calculateRisk(ClientData data) {
        return (data.getInvestments() * 0.4)
                - (data.getAge() * 0.1)
                + (data.getVolatilityTolerance() * 1.0);
    }
}
