package com.louis.mango.dao;

import com.louis.mango.po.SysUserPO;

import java.util.Map;

public interface ISysUserDAO {

    public SysUserPO get(Map<String,Object> map);
}
