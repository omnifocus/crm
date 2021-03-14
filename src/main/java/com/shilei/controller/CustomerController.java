package com.shilei.controller;


import com.shilei.bean.Customer;
import com.shilei.service.CustomerService;
import com.shilei.util.Page;
import com.shilei.util.QueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lei
 * @since 2021-03-13
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/list.action")
    public String list(QueryVo vo,Model model) {
        int _page = vo.getPage();
        int start = vo.getPage() - 1;
        int size = vo.getRows();
        List<Customer> customers = customerService.selectCustomersByCondition(vo);
        int total = customerService.selectCustomersCountByCondition(vo);
        Page<Customer> page = new Page(_page,total, size, customers);
        model.addAttribute("page",page);
        return "customer";
    }

}

