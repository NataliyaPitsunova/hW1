package DZ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Registry registry = context.getBean("Registry", Registry.class);
        registry.getTicketAndChart(new Patient(123,"Petrov", Dept.terapy));
    }
}
