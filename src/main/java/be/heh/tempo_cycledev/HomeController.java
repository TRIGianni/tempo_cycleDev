package be.heh.tempo_cycledev;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class HomeController {

  @RequestMapping("/")
  @ResponseBody
  String home(){
    return "Hello World";
  }
}
