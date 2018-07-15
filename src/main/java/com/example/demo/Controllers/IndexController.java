/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author fabioalvaro
 */
@RestController

@RequestMapping("/")
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "chegou no index do demo.";
    }

    @RequestMapping("nada")
    public String nada() {
        return "chegou no nada do demo.";
    }

    @GetMapping("/status")
    public String smsStatus() {
        long heapNow = Runtime.getRuntime().totalMemory();
        //System.out.println("Tamanho do Heap Agora: " + (() / 1024 / 1024) + " MB");
        return "heap Now " + heapNow;

    }
    
        @GetMapping("status2")
    public String smsStatus2() {
        long heapNow = Runtime.getRuntime().totalMemory();
        //System.out.println("Tamanho do Heap Agora: " + (() / 1024 / 1024) + " MB");
        return "heap Now " + heapNow;

    }

}
