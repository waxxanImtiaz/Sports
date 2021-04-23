package sports.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sports.util.ArithematicUtil;

public class PessangerService {
    private ArithematicUtil arithematicUtil;
    public int add(int a, int b){
        return arithematicUtil.add(a, b);
    }

    public PessangerService(ArithematicUtil arithematicUtil){
        this.arithematicUtil = arithematicUtil;
    }
}
