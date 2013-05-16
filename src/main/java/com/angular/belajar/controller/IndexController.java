/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.angular.belajar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author cak-ust
 */
@Controller
@RequestMapping("/")
public class IndexController {
    @RequestMapping("/")
    public String getIndexPage(){
        return "index";
    }
}
