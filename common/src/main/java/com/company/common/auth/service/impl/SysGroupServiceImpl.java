package com.company.common.auth.service.impl;

import com.company.common.auth.dao.SysGroupMapper;
import com.company.common.auth.model.SysGroup;
import com.company.common.auth.service.SysGroupService;
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
@Transactional(rollbackFor = Exception.class)
public class SysGroupServiceImpl extends AbstractService<SysGroup> implements SysGroupService {

    @Resource
    private SysGroupMapper sysGroupMapper;

}
