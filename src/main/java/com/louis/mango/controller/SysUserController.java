package com.louis.mango.controller;

import com.louis.mango.bo.SysUserBO;
import com.louis.mango.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class SysUserController {

    @Autowired
    private ISysUserService sysUserService;

    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public SysUserBO getUser(@PathVariable(value = "id") String id){

        SysUserBO sysUserBO = sysUserService.getUser(id);

        return sysUserBO;

    }
}
