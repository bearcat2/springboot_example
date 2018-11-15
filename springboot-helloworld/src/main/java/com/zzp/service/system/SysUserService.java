package com.zzp.service.system;

import com.zzp.entity.system.SysUser;

import java.util.List;

/**
 * <p> Description: 系统用户service接口 </p>
 * <p> Title: SysUserService </p>
 * <p> Create Time: 2018/11/15 22:29 </p>
 *
 * @author: zhongzhipeng
 * @version: 1.0
 */
public interface SysUserService {

    List<SysUser> listUser();
}
