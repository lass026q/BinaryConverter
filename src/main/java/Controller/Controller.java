package Controller;
import Ressources.Converter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    public class Controller {
        Converter conv = new Converter();
        @GetMapping("")
        public String start(){
            return "List of commands: /convertbinary?input=binary";
        }

        @GetMapping("/convertbinary")
        public String convertBinary(@RequestParam String input){
            return "The binary in decimals is: " + conv.conversion(input);
        }
    }

