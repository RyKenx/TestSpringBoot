package site.hje.testspringboot.demo.Controller;

import lombok.extern.log4j.Log4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import site.hje.testspringboot.demo.Model.SaveUserModel;
import site.hje.testspringboot.demo.Utile.ModelUtile;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {

    @RequestMapping("/test")
    public @ResponseBody String TestOut(@RequestBody SaveUserModel saveUserModel){
        List<String> stringList = new ArrayList<>();
        stringList.add("ass");
        //language=JSON
        String json = "{\"userName\": \"sd\"}";
        ModelUtile.setUserModel(saveUserModel);
        return "Test!";
    }
}
