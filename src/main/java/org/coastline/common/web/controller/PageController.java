package org.coastline.common.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Jay.H.Zou
 * @date 2019/2/9
 */
@Controller
public class PageController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/index2", method = RequestMethod.GET)
    public String index2() {
        return "index2";
    }
}
