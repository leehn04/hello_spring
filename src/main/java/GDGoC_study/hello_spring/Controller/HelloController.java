package GDGoC_study.hello_spring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld";
    }
    @GetMapping("/bye")
    @ResponseBody
    public String bye() {
        return "bye!";
    }

}
