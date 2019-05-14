package com.company.core.service;

import com.company.common.auth.model.SysUser;
import com.company.common.auth.service.SysUserService;
import com.company.core.BaseTestService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceTest extends BaseTestService {


    @Autowired
    private SysUserService userService;

    @Test
    public void findOne() throws Exception {
        SysUser user = userService.findById(1L);
        Assert.assertEquals(Long.valueOf(1), user.getId());
    }


}