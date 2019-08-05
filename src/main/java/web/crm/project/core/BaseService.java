/*****************************************************************************
 * Copyright (c) 2015, www.qingshixun.com
 *
 * All rights reserved
 *
 *****************************************************************************/

package web.crm.project.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import web.crm.project.model.model.UserModel;
import web.crm.project.security.SecurityHelper;

/**
 * Service 基类
 * 
 * @author QingShiXun
 * 
 * @version 1.0
 */
public abstract class BaseService {
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	/**
	 * 获取当前登录用户信息
	 * 
	 * @return
	 */
	protected UserModel getCurrentUser() {
		return SecurityHelper.getCurrentUser();
	}
}
