package guru.springframework.controllers;

import guru.springframework.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @Autowired
    private ProductService service;

    @RequestMapping("/")
    public String getIndex(Model model){
        model.addAttribute("products", service.listProducts());
        return "index";
    }
}
