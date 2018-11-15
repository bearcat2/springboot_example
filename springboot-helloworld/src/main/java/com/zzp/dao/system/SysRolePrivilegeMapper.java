package com.zzp.dao.system;

import com.zzp.entity.system.SysRolePrivilege;
import com.zzp.entity.system.SysRolePrivilegeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysRolePrivilegeMapper {
    int countByExample(SysRolePrivilegeExample example);

    int deleteByExample(SysRolePrivilegeExample example);

    int deleteByPrimaryKey(Integer srpId);

    int insert(SysRolePrivilege record);

    int insertSelective(SysRolePrivilege record);

    List<SysRolePrivilege> selectByExample(SysRolePrivilegeExample example);

    SysRolePrivilege selectByPrimaryKey(Integer srpId);

    int updateByExampleSelective(@Param("record") SysRolePrivilege record, @Param("example") SysRolePrivilegeExample example);

    int updateByExample(@Param("record") SysRolePrivilege record, @Param("example") SysRolePrivilegeExample example);

    int updateByPrimaryKeySelective(SysRolePrivilege record);

    int updateByPrimaryKey(SysRolePrivilege record);
}