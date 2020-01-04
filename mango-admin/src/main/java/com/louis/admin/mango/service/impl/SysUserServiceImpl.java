package com.louis.admin.mango.service.impl;

import com.louis.admin.mango.model.SysUser;
import com.louis.admin.mango.dao.SysUserMapper;
import com.louis.admin.mango.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> findAll() {
        return sysUserMapper.findAll();
    }
}
