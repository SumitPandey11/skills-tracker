package org.launchcode.skillstracker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SkillsController {
        @GetMapping
        @ResponseBody
        public String helloMe(){
            String text = "<h1>Skills Tracker</h1>" +
                    "<p><h2>We have a few skills we would like to learn. Here is the list</h2>" +
                    "<p><ol><li>Java</li><li>JavaScript</li><li>Python</li></ol>";

            return text;
        }

        @GetMapping("form")
        @ResponseBody
        public String form(){
            //String text ="<p>Name:</p><input type='text'>";

            String text = "<form method=\"get\">\n" +
                    "<p>Name:</p><input type='text'>" +
                    "  <br>" +
                    "<label for=\"cars\">My favorite language:</label>\n" +
                    "  <select name=\"f1\" id=\"f1\">\n" +
                    "    <option value=\"java\">java</option>\n" +
                    "    <option value=\"JavaScript\">JavaScript</option>\n" +
                    "    <option value=\"Python\">Python</option>\n" +
                    "  </select>\n" +
                    "  <br><br>\n" +
                    "<label for=\"cars\">My second favorite language:</label>\n" +
                    "  <select name=\"f2\" id=\"f2\">\n" +
                    "    <option value=\"java\">java</option>\n" +
                    "    <option value=\"JavaScript\">JavaScript</option>\n" +
                    "    <option value=\"Python\">Python</option>\n" +
                    "  </select>\n" +
                    "  <br><br>\n" +
                    "<label for=\"cars\">My third favorite language:</label>\n" +
                    "  <select name=\"f3\" id=\"f3\">\n" +
                    "    <option value=\"java\">java</option>\n" +
                    "    <option value=\"JavaScript\">JavaScript</option>\n" +
                    "    <option value=\"Python\">Python</option>\n" +
                    "  </select>\n" +
                    "  <br><br>\n" +
                    "  <input type=\"submit\" value=\"Submit\">\n" +
                    "</form>";

            return  text;

        }

    @PostMapping(value="form")
    @ResponseBody
    public String postMappingDisplay(@RequestParam String f1,@RequestParam String f2,@RequestParam String f3){
        String text = "<h1>Skills Tracker</h1>" +
                "<p><h2>We have a few skills we would like to learn. Here is the list</h2>" +
                "<p><ol><li>"+f1+"</li><li>"+f2+"</li><li>"+f3+"</li></ol>";

        return text;
    }

}
