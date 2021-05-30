package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {


    @GetMapping("skillsform")
    public String skillsForm() {
        return "<html>" +
                "<body>" +
                "<form action = '/skills' method = 'post'>" + // submit a request to /hello
                "<h1>Skills Tracker</h1>"+
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>"+
                "<ol>"+
                "<li>Java</li>"+
                "<li>Javascript</li>"+
                "<li>Python</li>"+
                "</ol>"+
                "</form>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("userform")
    public String userForm(){
        return "<html>" +
                "<body>" +
                "<form action = 'userform' method = 'post'>" +
                "<h3>Name</h3>"+
                "<input type = 'text' name = 'name'>" +
                "<h3>My Favourite Language</h3>"+
                "<select name='language1' id ='lang1'>"+
                "<option value ='java'>Java</option>" +
                "<option value ='javascript'>JavaScript</option>"+
                "<option value ='python'>Python</option>"+
                "</select>"+
                "<h3>My Second Favourite Language</h3>"+
                "<select name='language2' id ='lang2'>"+
                "<option value ='java'>Java</option>" +
                "<option value ='javascript'>JavaScript</option>"+
                "<option value ='python'>Python</option>"+
                "</select>"+
                "<h3>My Third Favourite Language</h3>"+
                "<select name='language3' id ='lang3'>"+
                "<option value ='java'>Java</option>" +
                "<option value ='javascript'>JavaScript</option>"+
                "<option value ='python'>Python</option>"+
                "</select>"+
                "<input type = 'submit' value = 'Greet Me!' >" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @RequestMapping(value="userform", method = RequestMethod.POST)
    @ResponseBody
    public String createSkills(@RequestParam String name, @RequestParam String language1,@RequestParam String language2,@RequestParam String language3){
        System.out.println("test");
        return "<h1>"+name+"</h1>"+"\n" +
                "<ol>"+
                "<li>"+language1+"</li>"+
                "<li>"+language2+"</li>"+
                "<li>"+language3+"</li>"+
                "</ol>";
    }

}

