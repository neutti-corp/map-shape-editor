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

    @RequestMapping(value="evt-system.html", method = {RequestMethod.GET})
    public String evts(Model model, HttpServletRequest request) throws Exception {
        model.addAttribute("TYPE1","EVTS");
        model.addAttribute("SYSTEM_TITLE","외부차량 위치추적 시스템 : 대한민국육군");
        model.addAttribute("SYSTEM_MAINTITLE","대한민국육군");
        model.addAttribute("SYSTEM_SUBTITLE","Republic Of Korea Army");
        return "map/index";
    }

    @RequestMapping(value="sgv-system.html", method = {RequestMethod.GET})
    public String sgvs(Model model, HttpServletRequest request) throws Exception {
        model.addAttribute("TYPE1","SGVS");
        model.addAttribute("SYSTEM_TITLE","스마트위병소 영상관제 시스템 : 해병대교육훈련단");
        model.addAttribute("SYSTEM_MAINTITLE","해병대교육훈련단");
        model.addAttribute("SYSTEM_SUBTITLE","ROK Marine Corps Education & Training Group");
        return "map/index";
    }

    @RequestMapping(value="etri-map.html", method = {RequestMethod.GET})
    public String etri(Model model, HttpServletRequest request) throws Exception {
        model.addAttribute("TYPE1","SGVS");
        model.addAttribute("SYSTEM_TITLE","ETRI : 재해분석시스템");
        model.addAttribute("SYSTEM_MAINTITLE","재해분석시스템");
        model.addAttribute("SYSTEM_SUBTITLE","");
        return "etri/index";
    }

}
