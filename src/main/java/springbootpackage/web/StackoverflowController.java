package springbootpackage.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springbootpackage.model.Cell;
import springbootpackage.service.StackoverflowService;

import java.util.List;

@Controller
@RequestMapping("/api/thegameoflife")
public class StackoverflowController{

    @Autowired
    private StackoverflowService stackoverflowService;

    @RequestMapping
    @ResponseBody
    public List<Cell> startGame(){

        return stackoverflowService.returnFirstGeneration();
    }
}