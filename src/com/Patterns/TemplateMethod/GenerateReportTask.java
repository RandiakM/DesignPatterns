package com.Patterns.TemplateMethod;

public class GenerateReportTask {
    private AuditTrail auditTrail;

    public GenerateReportTask(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    private void execute(){
        auditTrail.record();

        System.out.println("Generate Report");
    }
}
