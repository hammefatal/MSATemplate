package home.hammefatal.msa.serviceb.adapter.in.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccessServiceBController {

    @GetMapping(path = "/b/test")
    public String AccessServiceBTest() {
        return "Access test on Service-B...";
    }

}
