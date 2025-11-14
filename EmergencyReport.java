public class EmergencyReport implements Report {
    ...
}

public class EmergencyReportCreator extends ReportCreator {
    @Override
    protected Report createReport() {
        return new EmergencyReport();
    }
}
