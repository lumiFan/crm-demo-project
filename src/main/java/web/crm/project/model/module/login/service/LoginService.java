/*****************************************************************************
 * Copyright (c) 2015, www.qingshixun.com
 *
 * All rights reserved
 *
 *****************************************************************************/

package web.crm.project.model.module.login.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.crm.project.core.BaseService;
import web.crm.project.model.module.login.dao.LoginDao;

/**
 * 登录处理 Service 类
 * 
 * @author QingShiXun
 * 
 * @version 1.0
 */
@Service
@Transactional
public class LoginService extends BaseService {

    // 注入登录处理Dao
    @Autowired
    private LoginDao loginDao;
}
