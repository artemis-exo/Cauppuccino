package net.engineeringdigest.journalApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Car {

    @Autowired  // Field Injection
    private Dog dog;

    @GetMapping("okie")
    public String ok(){
        return dog.fun();
    }

}
