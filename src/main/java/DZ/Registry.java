package DZ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Registry")
public class Registry {
    private Department department;
    private PatientCharts patientCharts;

    @Autowired(required = false)
    @Qualifier("Chart")
    public void setPatientCharts(PatientCharts patientCharts) {
        this.patientCharts = patientCharts;
    }

    @Autowired(required = false)
    @Qualifier("Department")
    public void setDepartment(Department department) {
        this.department = department;
    }

    public void getTicketAndChart(Patient patient) {
        patientCharts.getChart(patient.getSNILS(),patient.getSurName());
        department.direct(patient.getDept());
    }
}