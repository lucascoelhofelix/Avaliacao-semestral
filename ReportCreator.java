public abstract class ReportCreator {

    // Factory Method
    protected abstract Report createReport();

    // Template de criação do relatório
    public void buildReport() {
        Report report = createReport();
        report.prepareData();
        report.generateFormat();
        report.print();
    }
}
