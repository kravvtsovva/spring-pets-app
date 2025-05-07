package pets;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;



@Component
public class Cat {

    public void sound(){
        System.out.println("Кот: Мяу!");
    }

    @PostConstruct
    private void init(){
        System.out.println("Cat инициализирован");
    }

    @PreDestroy
    private void destroy(){
        System.out.println("Cat уничтожен");
    }

}
