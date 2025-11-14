public class ReportCreatorSemanal extends ReportCreator {

    @Override
    protected Report createReport() {
        return new WeeklyReport();
    }
}
