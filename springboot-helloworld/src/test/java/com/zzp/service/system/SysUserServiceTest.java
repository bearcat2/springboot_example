package com.zzp.service.system;

import com.zzp.MainApplicationTests;
import com.zzp.entity.system.SysUser;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * <p> Description: </p>
 * <p> Title: SysUserServiceTest </p>
 * <p> Create Time: 2018/11/15 22:34 </p>
 *
 * @author: zhongzhipeng
 * @version: 1.0
 */
@Slf4j
public class SysUserServiceTest extends MainApplicationTests {

    @Autowired
    private SysUserService sysUserService;

    @Test
    public void listUser() throws Exception {
        List<SysUser> sysUsers = this.sysUserService.listUser();
        log.info("集合元素内容", sysUsers.toString());
    }

}