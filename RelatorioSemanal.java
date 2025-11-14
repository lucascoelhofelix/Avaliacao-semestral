public class RelatorioSemanal implements Report {

    @Override
    public void prepareData() {
        System.out.println("Coletando dados agregados da semana...");
    }

    @Override
    public void generateFormat() {
        System.out.println("Gerando relatório semanal em formato XLSX.");
    }

    @Override
    public void print() {
        System.out.println("Imprimindo Relatório Semanal.");
    }
}
