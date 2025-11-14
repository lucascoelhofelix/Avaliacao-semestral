public class RelatorioDiario implements Report {

    @Override
    public void prepareData() {
        System.out.println("Coletando dados do dia e métricas prioritárias...");
    }

    @Override
    public void generateFormat() {
        System.out.println("Gerando relatório diário em formato PDF.");
    }

    @Override
    public void print() {
        System.out.println("Imprimindo Relatório Diário.");
    }
}
