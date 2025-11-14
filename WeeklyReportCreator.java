public class WeeklyReportCreator extends ReportCreator {

    @Override
    protected Report createReport() {
        return new WeeklyReport();
    }
}
