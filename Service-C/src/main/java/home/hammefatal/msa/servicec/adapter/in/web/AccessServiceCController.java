package home.hammefatal.msa.servicec.adapter.in.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccessServiceCController {

    @GetMapping(path = "/c/test")
    public String AccessServiceCTest() {
        return "Access test on Service-C...";
    }

}
