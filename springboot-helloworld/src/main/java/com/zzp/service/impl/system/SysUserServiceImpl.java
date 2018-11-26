package com.zzp.service.impl.system;

import com.zzp.dao.system.SysUserMapper;
import com.zzp.entity.system.SysUser;
import com.zzp.entity.system.SysUserExample;
import com.zzp.service.system.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p> Description: 系统用户service接口实现类 </p>
 * <p> Title: SysUserServiceImpl </p>
 * <p> Create Time: 2018/11/15 22:31 </p>
 *
 * @author: zhongzhipeng
 * @version: 1.0
 */
@Slf4j
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> listUser() {
        SysUserExample sysUserExample = new SysUserExample();
        List<SysUser> sysUsers = this.sysUserMapper.selectByExample(sysUserExample);
        return sysUsers;
    }

    @Async
    @Override
    public void asyncTask() {
        log.info("asyncTask执行");
    }
}
