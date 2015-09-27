package com.vostrik.controllers;

import com.vostrik.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by EVostrikova on 13.08.15.
 */


@Controller
public class BaseController {

    @Autowired
    UserService userService;

    final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value="/short/*", method = RequestMethod.GET)
    public String redirect(HttpServletRequest request, ModelMap map) throws IOException {
        String uri = request.getRequestURI();
        String longLink = new String(userService.getLongUrl(uri.substring(uri.length()-8)));
        return "redirect:"+longLink;
    }
}
