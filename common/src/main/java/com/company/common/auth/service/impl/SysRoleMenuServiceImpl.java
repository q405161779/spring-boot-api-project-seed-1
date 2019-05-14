package com.company.common.auth.service.impl;

import com.company.common.auth.dao.SysRoleMenuMapper;
import com.company.common.auth.model.SysRoleMenu;
import com.company.common.auth.service.SysRoleMenuService;
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
public class SysRoleMenuServiceImpl extends AbstractService<SysRoleMenu> implements SysRoleMenuService {

    @Resource
    private SysRoleMenuMapper sysRoleMenuMapper;

}
