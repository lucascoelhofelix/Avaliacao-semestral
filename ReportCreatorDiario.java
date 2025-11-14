public class ReportCreatorDiario extends ReportCreator {

    @Override
    protected Report createReport() {
        return new ReportDiario();
    }
}
