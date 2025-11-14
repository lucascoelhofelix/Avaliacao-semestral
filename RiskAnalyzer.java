public class RiskAnalyzer {

    private RiskStrategy strategy;

    public RiskAnalyzer(RiskStrategy strategy) {
        this.strategy = strategy;
    }

    // permite trocar estratégia dinamicamente
    public void setStrategy(RiskStrategy strategy) {
        this.strategy = strategy;
    }

    public double analyze(ClientData clientData) {
        return strategy.calculateRisk(clientData);
    }
}
