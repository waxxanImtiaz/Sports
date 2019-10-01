package controllers;

import api.BaseExecutor;
import api.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import services.ClassService;

import java.util.List;

@Controller
public class IndexController {
    @Autowired
    private ClassService classService;

    /*================SEARCHING MEHTOD======================*/
    @SuppressWarnings("unchecked")
    @RequestMapping(method = RequestMethod.GET, value = "/classes/all")
    public BaseResponse getAllClasses() {

        try {
            Iterable data = classService.getAllClasses();
            return BaseExecutor.getBaseResponse(data);
        } catch (Exception e) {
            return BaseExecutor.getBaseResponse(null);
        }
    }
}
