public class DailyReportCreator extends ReportCreator {

    @Override
    protected Report createReport() {
        return new DailyReport();
    }
}
