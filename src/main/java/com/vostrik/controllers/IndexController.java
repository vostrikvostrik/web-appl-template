package com.vostrik.controllers;

import com.vostrik.service.MemberNoteService;
import com.vostrik.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by EVostrikova on 10.07.15.
 */

@RequestMapping("/")
@Controller
public class IndexController {

    @Autowired
    UserService userService;

    @Autowired
    MemberNoteService memberNoteService;

    @RequestMapping(value="/index", method = RequestMethod.GET)
    public String printWelcome(ModelMap map) throws IOException {
        map.addAttribute("tableList", memberNoteService.getNotesList());
        return "index";
    }

    @RequestMapping(value = "/generate", method = RequestMethod.POST)
    @ResponseBody
    public String generateShort(@RequestParam(value = "url") String url, HttpServletRequest request, ModelMap model) throws IOException {
        return (request.getContextPath() +"/"+ userService.generateShortUrl(url));
    }

    @RequestMapping("/")
    public String redirectEmpty() {
        return "redirect:/index";
    }
}

