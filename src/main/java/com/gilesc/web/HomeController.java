package com.gilesc.web;

import com.gilesc.Pizza;
import com.gilesc.PizzaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {
    @Autowired
    PizzaDAO dao;

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        Pizza p = new Pizza();
        List<Pizza> list = dao.getAll();
        return "home";
    }

}
