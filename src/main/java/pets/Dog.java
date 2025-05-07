package pets;

import org.springframework.stereotype.Component;

@Component
public class Dog {
    public void sound(){
        System.out.println("Cобака: Гав!");
    }
}
