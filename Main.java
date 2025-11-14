public class Main {
    public static void main(String[] args) {

        ReportCreator dailyCreator = new DailyReportCreator();
        ReportCreator weeklyCreator = new WeeklyReportCreator();

        System.out.println("=== GERANDO RELATÓRIO DIÁRIO ===");
        dailyCreator.buildReport();

        System.out.println("\n=== GERANDO RELATÓRIO SEMANAL ===");
        weeklyCreator.buildReport();
    }
}
