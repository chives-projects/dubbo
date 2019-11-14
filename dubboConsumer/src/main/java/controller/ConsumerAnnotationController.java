package controller;

import Annotation.ConsumerAnnotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ConsumerAnnotationController {
    @Autowired
    ConsumerAnnotationService consumerAnnotationService;


//    @RequestMapping("/getUser")
    public String getUSer(int id) {
        return consumerAnnotationService.doSayHello("hello");
    }
}
