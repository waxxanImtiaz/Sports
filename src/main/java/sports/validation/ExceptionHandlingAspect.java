package sports.validation;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;
import sports.exceptions.PessangerDoesNotFoundException;

@Aspect
@Configuration
public class ExceptionHandlingAspect {

    @AfterThrowing(
            pointcut = "execution(* sports.dao.PessangerDao*.*(..)))",
            throwing = "ex"
    )
    public void log(PessangerDoesNotFoundException ex){
        System.out.println("ExceptionHandlingAspect:"+ex.getMessage());
    }
}
