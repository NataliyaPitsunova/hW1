package DZ;

import org.springframework.stereotype.Component;

/*@Component("Department")*/
public class Surgeon implements Department{
    @Override
    public void direct(Dept dept) {
        System.out.println("Выдано направление к хирургу");
    }
}
