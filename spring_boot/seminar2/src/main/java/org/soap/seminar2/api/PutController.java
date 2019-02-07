package org.soap.seminar2.api;

import org.soap.seminar2.model.User;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("put")
public class PutController {
    @PutMapping("")
    public String putUser(@RequestBody final User user) {
        return user.getPart();
    }
}
