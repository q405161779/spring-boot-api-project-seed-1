package com.company.common.auth.service.impl;

import com.company.common.auth.dao.SysUserMapper;
import com.company.common.auth.model.SysUser;
import com.company.common.auth.service.SysUserService;
import com.company.common.base.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created with CodeGenerator
 * Description:
 * @author  LErry.li
 * Date: 2018年7月7日
 * Time: 下午7:19:11
 */
@Service
@Transactional
public class SysUserServiceImpl extends AbstractService<SysUser> implements SysUserService {

    @Resource
    private SysUserMapper sysUserMapper;

}
