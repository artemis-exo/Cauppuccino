package net.engineeringdigest.journalApp;

import org.springframework.stereotype.Component;

@Component
public class Dog {
    // Class is automatically  registered as Spring bean.

    public String fun(){
        return "somethings";
    }
}
