package main.java.com.veventmgmt.models;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/")
public class EventModelController {
    @RequestMapping("/model")
    public String method(){
        return "<h1>hello</h1>";
    }

    @GetMapping(value="/models")
    public ResponseEntity<MenuModel> fetch() {
        MenuModel mm = new MenuModel();
        return new ResponseEntity<MenuModel>(mm, HttpStatus.OK)
    }

    //tetddds
    
}
