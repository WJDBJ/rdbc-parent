package com.nf.rbac.controller.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author cj
 * @date 2019/12/3
 */
@Controller
public class JQueryTreeController {

    @RequestMapping("/test/tree")
    public String tree(){
        return "test/tree";
    }
}
