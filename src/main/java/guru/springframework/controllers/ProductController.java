package guru.springframework.controllers;

import guru.springframework.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

    @Autowired
    private ProductService service;

    @RequestMapping("/product")
    public String getProduct() {
        return "redirect:/";
    }


    @RequestMapping("/product/{id}")
    public String getProductById(@PathVariable int id, Model model){

        model.addAttribute("product", service.getProduct(id));

        return "product";
    }
}
