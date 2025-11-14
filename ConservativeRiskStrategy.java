public class ConservativeRiskStrategy implements RiskStrategy {

    @Override
    public double calculateRisk(ClientData data) {
        return (data.getInvestments() * 0.2)
                - (data.getAge() * 0.3)
                + (data.getVolatilityTolerance() * 0.5);
    }
}
