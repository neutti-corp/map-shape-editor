package com.neutti.webpage;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@Controller
@RequestMapping(value="map")
public class MapController {

    @RequestMapping(value="index.html", method = {RequestMethod.GET})
    public String index(Model model, HttpServletRequest request) throws Exception {
        return "map/index";
    }

}
