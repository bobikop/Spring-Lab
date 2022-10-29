package com.cydeo.controllor;

import com.cydeo.model.Product;
import com.cydeo.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
//@RequestMapping("/product")
public class ProductController {

   private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/create-product")
    public String createProduct(@ModelAttribute("product")  Product product){
       productService.productCreate(product);
        return "redirect:/list";
    }

    @GetMapping("/list")
    public String retrieveAllList(Model model){
        model.addAttribute("productList", productService.listProduct());
        return "product/list";
    }

    @GetMapping ("/create-form")
    public String getCreateProductForm(Model model){
        model.addAttribute("product", new Product());
                return "/product/create-product";
    }


}
