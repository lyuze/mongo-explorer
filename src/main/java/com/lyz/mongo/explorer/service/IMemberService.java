/**
 * 操作权限接口：
 * <p>读，写权限的控制，
 * 速度限制，空间大小
 * <p>静态限制：随用户变化
 */
package com.lyz.mongo.explorer.service;

import javax.core.common.ResultMsg;

/**
 * 文件访问和存储接口定义
 * @author liuyuze
 *
 */
public interface IMemberService {

	ResultMsg<?> login(String loginName,String loginPass);

	ResultMsg<?> logout(String loginName);

}
