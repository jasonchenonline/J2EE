package com.nowcoder.controller;

import com.nowcoder.aspect.LogAspect;
import com.nowcoder.service.WendaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2016/7/12.
 */
@Controller
public class SettingController {

    private static final Logger logger = LoggerFactory.getLogger(LogAspect.class);

    @Autowired
    WendaService wendaService;
    @RequestMapping(path={"/setting"},method = {RequestMethod.GET})
    @ResponseBody
    public String setting(HttpSession httpSession ){
        logger.info("setting page");
        return "setting OK "+wendaService.getMessage(1);
    }
}
