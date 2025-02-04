package home.hammefatal.msa.servicea.adapter.in.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccessServiceAController {

    @GetMapping(path = "/a/test")
    public String AccessServiceATest() {
        return "Access test on Service-A...";
    }

}
