package sports.dao;

import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import sports.beans.Pessanger;
import sports.exceptions.PessangerDoesNotFoundException;

import java.util.HashMap;
import java.util.Map;
@Component
//@Scope(value = SINGLETO)
public class PessangerDao {
    private Map<Integer,Pessanger> pessangerMap = new HashMap<>();

    PessangerDao(){
        pessangerMap.put(1,new Pessanger(1));
        pessangerMap.put(2,new Pessanger(2));
        pessangerMap.put(3,new Pessanger(3));
        pessangerMap.put(4,new Pessanger(4));
        pessangerMap.put(5,new Pessanger(5));
    }

    public Pessanger getPessenger(int id){
        if (id < pessangerMap.size()) {
            System.out.println("getPessenger is executed");
            return pessangerMap.get(id);
        }else
        {
            throw new PessangerDoesNotFoundException("Pessenger not found");
        }
    }
}
