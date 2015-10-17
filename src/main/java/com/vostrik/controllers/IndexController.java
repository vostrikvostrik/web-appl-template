package com.vostrik.controllers;

import com.vostrik.db.bean.MemberNote;
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
import java.util.List;
import java.util.Map;

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
    public String printWelcome(Map<String, Object>  map) throws IOException {
        List<MemberNote> memberNoteList = memberNoteService.getNotesListAsObject();
        map.put("tableList", memberNoteList);
        return "index";
    }

    @RequestMapping(value = "/generate", method = RequestMethod.POST)
    @ResponseBody
    public String generateShort(@RequestParam(value = "noteText") String noteText, HttpServletRequest request, ModelMap model) throws IOException {
        return /*(request.getContextPath() +"/"+ userService.generateShortUrl(noteText))*/"noteText = " + noteText;
    }

    @RequestMapping("/")
    public String redirectEmpty() {
        return "redirect:/index";
    }
}

