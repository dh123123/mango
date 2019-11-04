package com.louis.mango.service.impl;

import com.louis.mango.bo.SysUserBO;
import com.louis.mango.dao.ISysUserDAO;
import com.louis.mango.po.SysUserPO;
import com.louis.mango.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class SysUserService implements ISysUserService {

    @Autowired
    private ISysUserDAO sysUserDAO;

    @Override
    public SysUserBO getUser(String id) {

        Map<String, Object> map = new HashMap<>();
        map.put("id",id);

        SysUserPO sysUserPO = sysUserDAO.get(map);

        SysUserBO sysUserBO = new SysUserBO();
        sysUserBO.setName(sysUserPO.getName());

        return sysUserBO;
    }
}
