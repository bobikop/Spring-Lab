package com.cydeo;

import com.cydeo.config.ConfigApp;
import com.cydeo.model.Cart;
import com.cydeo.service.CartService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.math.BigDecimal;

public class CartApp {
    public static void main(String[] args) {


        Cart myCart = new Cart();
        myCart.setCartTotalAmount(BigDecimal.valueOf(2560.2622222));




        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp.class);

        CartService service1 = context.getBean(CartService.class);

        System.out.println(service1);


    }
}
