package DZ;

import org.springframework.stereotype.Component;

@Component("Chart")
public class PatientChart implements PatientCharts {

    public void getChart(int SNILS, String surname) {
        System.out.println("Карта выдана " + surname + " " + SNILS);
    }
}
