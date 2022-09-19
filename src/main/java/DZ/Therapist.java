package DZ;

import org.springframework.stereotype.Component;

@Component("Department")
public class Therapist implements Department {
    public void direct(Dept dept) {
        System.out.println("Выдано направление к терапевту");
    }
}

