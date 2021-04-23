package sports.flight;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class FlyerImp implements Flyer{

    public FlyerImp(){
        System.out.println("FlyerImp is created");
    }
    @Override
    public void takeOff() {
        System.out.println("Taking off");
    }

    @Override
    public void fly() {
        System.out.println("Flying");
    }

    @Override
    public void land() {
        System.out.println("Landing");
    }
}
