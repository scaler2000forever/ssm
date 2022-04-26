package com.atlinlin.controller;

/**
 * @ author : LiLin
 * @ create : 2022-04-24 12:48
 */

import com.atlinlin.domain.Account;
import com.atlinlin.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 帐户web
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层，查询所有账户....");
        //调用service层方法
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);
        return "list";
    }

    /**
     * 保存
     * @param account
     * @return
     */
//    @RequestMapping("/save")
//    public void save(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
//        System.out.println("表现层，查询所有账户....");
//        //调用service层方法
//        accountService.saveAccount(account);
//        response.sendRedirect(request.getContextPath()+"/account/findAll");
//        return ;
//    }
//
  @RequestMapping("/save")
    public String save(Account account) {
        System.out.println("表现层，查询所有账户....");
        //调用service层方法
        accountService.saveAccount(account);
        return "redirect:/account/findAll" ;
    }



}
