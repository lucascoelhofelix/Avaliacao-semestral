public class Main {

    public static void main(String[] args) {

        ClientData client = new ClientData(
            6000,
            45000,
            30,
            0.8
        );

        RiskAnalyzer analyzer = new RiskAnalyzer(new AggressiveRiskStrategy());

        double result1 = analyzer.analyze(client);  // usa modelo agressivo

        analyzer.setStrategy(new ModerateRiskStrategy());
        double result2 = analyzer.analyze(client);  // agora modelo moderado

        analyzer.setStrategy(new ConservativeRiskStrategy());
        double result3 = analyzer.analyze(client);  // agora conservador
    }
}
