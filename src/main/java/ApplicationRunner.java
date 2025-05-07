import config.ApplicationConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.PetService;

public class ApplicationRunner {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        var service = context.getBean(PetService.class);
        service.play();

        context.close();
    }
}
