package com.nowcoder.controller;


import com.nowcoder.aspect.LogAspect;
import com.nowcoder.model.User;
import com.nowcoder.service.WendaService;
import org.apache.commons.collections.map.HashedMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.server.PathParam;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/7/12.
 */
@Controller
    public class IndexController {
    @RequestMapping(path = {"/", "/index"})
    @ResponseBody
    public String index() {
        return "Hello NowCoder";
    }

    @RequestMapping(path= ("/profile/{groupId}/{userId}"))
    @ResponseBody
    public String profile(@PathVariable("userId") int userId,
                          @PathVariable("groupId") String groupId,
                          @RequestParam(value = "type", defaultValue = "1") int type,
                          @RequestParam(value = "key", required = false) String key) {
        return String.format("Profile Page of %s / %d, type:%d key: %s", groupId, userId, type, key);
    }
}//    @Autowired
//    WendaService wendaService;
//
//    private static final Logger logger = LoggerFactory.getLogger(LogAspect.class);
//
//    @RequestMapping(path={"/","index"},method = {RequestMethod.GET})
//    @ResponseBody
//    public String index(HttpSession httpSession ){
//        logger.info("home page");
//        return "Hello NowCoder"+wendaService.getMessage(2)+httpSession.getAttribute("msg");
//    }
//
//    @RequestMapping(path={"/profile/{group}/{userId}"})
//    @ResponseBody
//    public String profile(@PathVariable("userId") int userId,
//                          @PathVariable("group") String group,
//                          @RequestParam(value = "type",defaultValue = "2") int type,
//                          @RequestParam(value = "key",required = false) String key){
//        return String.format("Profile Page of %s /%d ,t:%d,k:%s", group,userId,type,key);
//    }
//
//        @RequestMapping(path={"/vm"},method = {RequestMethod.GET})
//        public String template(Model model){
//            model.addAttribute("value1","vvvv1");
//            List<String> colors = Arrays.asList(new String[]{"RED","GREEN","BLUE"});
//            model.addAttribute("colors",colors);
//            Map<String,String> map = new HashedMap();
//            for (int i=0;i<4;i++){
//                map.put(String.valueOf(i),String.valueOf(i*i));
//            }
//            model.addAttribute("map",map);
//
//            User user = new User("xiaokai") ;
//            model.addAttribute("user",user);
//
//        return "home";
//    }
//
//
//    @RequestMapping(path={"/request"},method = {RequestMethod.GET})
//    @ResponseBody
//    public String request(Model model, HttpServletResponse response,
//                          HttpServletRequest request,
//                          HttpSession httpSession,
//                          @CookieValue("JSESSIONID") String sessionId){
//        StringBuilder sb = new StringBuilder();
//
//        Enumeration<String> headerNames =request.getHeaderNames();
//        while (headerNames.hasMoreElements()){
//            String name = headerNames.nextElement();
//            sb.append(name+":"+ request.getHeader(name)+"<br>");
//        }
//
//        if (request.getCookies()!=null){
//            for (Cookie cookie : request.getCookies() ) {
//                sb.append("Cookie:"+cookie.getName()+"value:"+cookie.getValue());
//            }
//        }
//
//        sb.append(request.getMethod()+"<br>");
//        sb.append(request.getQueryString()+"<br>");
//        sb.append(request.getPathInfo()+"<br>");
//        sb.append(request.getRequestURL()+"<br>");
//
//        sb.append("session:"+sessionId+"<br>");
//
//        response.addHeader("xiaokai","hello");
//        response.addCookie(new Cookie("username","xiaokai"));
//        return sb.toString();
//    }
//
//    @RequestMapping(path={"/redirect/{code}"},method = {RequestMethod.GET})
//    public RedirectView redirect(@PathVariable("code") int code,
//                                 HttpSession httpSession){
//        httpSession.setAttribute("msg","jump from redirect");
//        RedirectView red = new RedirectView("/",true);
//        if (code==301){
//            red.setStatusCode(HttpStatus.MOVED_PERMANENTLY);
//        }
//        return red;
//    }
//
//    @RequestMapping(path={"/admin"},method = {RequestMethod.GET})
//    @ResponseBody
//    public String admin(@RequestParam("key") String key){
//            if ("admin".equals(key)){
//                return "Hello admin";
//            }
//        throw new IllegalArgumentException("参数不对");
//    }
//
//    @ExceptionHandler()
//    @ResponseBody
//    public String error(Exception e){
//        return "error:"+e.getMessage();
//    }

