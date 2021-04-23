package sports.validation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class PessangerValidation {

//    private SessionFactory  hibernateFactory;
//    @Before("execution(* sports.dao.PessangerDao*.*(..))")
//    public void isValidated(){
//        System.out.println("Before1 is executed");
//    }
//
//    @Before("execution(* sports.dao.PessangerDao*.*(..))")
//    public void before2(){
//        System.out.println("Before2 is executed");
//    }
//
//    @After("execution(* sports.dao.PessangerDao*.*(..))")
//    public void after(){
//        System.out.println("after1 is executed");
//    }
//    @Pointcut("within( sports.dao.PessangerDao)")
//    public void before2(){
//        System.out.println("Before2 is executed");
//    }
//
//    @After("before2()")
//    public void after(JoinPoint joinPoint){
//        System.out.println("after is executed");
//        System.out.println(joinPoint.toString());
//        System.out.println(joinPoint.getTarget().toString());
//        System.out.println(joinPoint.getSignature().toString());
//    }
////    @Pointcut("execution(public Pessanger getPessenger(int) )")
//    @Around("execution(* sports.dao.PessangerDao*.*(..))")
//    public Object around1(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
//        System.out.println("around1 is executed");
//        String methodName = proceedingJoinPoint.getSignature().getName();
//
//        Object[] args = proceedingJoinPoint.getArgs();
//        System.out.println("Param = "+args[0]);
//        Object result = proceedingJoinPoint.proceed();
////        Object result = proceedingJoinPoint.proceed(args);
//        return result;
////        System.out.println("Method :"+methodName+" result: "+result);
//
////        return null;
//    }
}
