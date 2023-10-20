package com.pratice.springjpa.order.controller;

import com.pratice.springjpa.order.model.dto.CategoryDTO;
import com.pratice.springjpa.order.model.dto.OrderDTO;
import com.pratice.springjpa.order.model.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;


    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/list")
    public String findOrderList(Model model){
        List<OrderDTO> orderList = orderService.findOrderList();

        model.addAttribute("orderList", orderList);

        return "order/list";
    }

    @GetMapping("/{orderId}")
    public String findOrderByCode(@PathVariable int orderId, Model model){
        OrderDTO order = orderService.findOrderByCode(orderId);

        model.addAttribute("order", order);

        return "order/detail";
    }

    @GetMapping(value = "/category", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public List<CategoryDTO> findCategoryList() {
        return orderService.findAllCategory();
    }

    @GetMapping("/regist")
    public void registPage(){}

    @PostMapping("/regist")
    public String registNewOrder(OrderDTO orderDTO) {
        orderService.registNewOrder(orderDTO);
        return "redirect:/order/list";
    }

    @GetMapping("/modify")
    public void modifyPage(){}

    @PostMapping("/modify")
    public String modifyOrder(OrderDTO orderDTO) {
        orderService.modifyOrder(orderDTO);
        return "redirect:/order/"+ orderDTO.getOrderId();
    }

    @GetMapping("/delete")
    public void deletePage(){}

    @PostMapping("/delete")
    public String deleteOrder(@RequestParam Integer orderId) {
        orderService.deleteOrder(orderId);

        return "redirect:/order/list";
    }

    @GetMapping("/querymethod")
    public void queryMethodPage() {}


    @GetMapping("/search")
    public String findByOrderPrice(@RequestParam Integer orderPrice, Model model) {
        List<OrderDTO> orderList = orderService.findByMenuPrice(orderPrice);

        model.addAttribute("orderList", orderList);
        model.addAttribute("orderPrice", orderPrice);

        return "order/searchResult";
    }
}
