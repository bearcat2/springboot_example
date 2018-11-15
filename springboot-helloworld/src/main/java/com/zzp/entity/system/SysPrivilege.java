package com.zzp.entity.system;

import java.io.Serializable;
import java.util.Date;

public class SysPrivilege implements Serializable {
    /**
     * 权限id
     */
    private Integer spId;

    /**
     * 资源名称
     */
    private String spName;

    /**
     * 资源uri
     */
    private String spUri;

    /**
     * 资源类型(1:模块;2:菜单;3:按钮)
     */
    private Integer spType;

    /**
     * 父权限id
     */
    private Integer spParentId;

    /**
     * 创建时间
     */
    private Date spCreateTime;

    /**
     * 修改时间
     */
    private Date spUpdateTime;

    private static final long serialVersionUID = 1L;

    /**
     * 权限id
     * @return sp_id 权限id
     */
    public Integer getSpId() {
        return spId;
    }

    /**
     * 权限id
     * @param spId 权限id
     */
    public void setSpId(Integer spId) {
        this.spId = spId;
    }

    /**
     * 资源名称
     * @return sp_name 资源名称
     */
    public String getSpName() {
        return spName;
    }

    /**
     * 资源名称
     * @param spName 资源名称
     */
    public void setSpName(String spName) {
        this.spName = spName == null ? null : spName.trim();
    }

    /**
     * 资源uri
     * @return sp_uri 资源uri
     */
    public String getSpUri() {
        return spUri;
    }

    /**
     * 资源uri
     * @param spUri 资源uri
     */
    public void setSpUri(String spUri) {
        this.spUri = spUri == null ? null : spUri.trim();
    }

    /**
     * 资源类型(1:模块;2:菜单;3:按钮)
     * @return sp_type 资源类型(1:模块;2:菜单;3:按钮)
     */
    public Integer getSpType() {
        return spType;
    }

    /**
     * 资源类型(1:模块;2:菜单;3:按钮)
     * @param spType 资源类型(1:模块;2:菜单;3:按钮)
     */
    public void setSpType(Integer spType) {
        this.spType = spType;
    }

    /**
     * 父权限id
     * @return sp_parent_id 父权限id
     */
    public Integer getSpParentId() {
        return spParentId;
    }

    /**
     * 父权限id
     * @param spParentId 父权限id
     */
    public void setSpParentId(Integer spParentId) {
        this.spParentId = spParentId;
    }

    /**
     * 创建时间
     * @return sp_create_time 创建时间
     */
    public Date getSpCreateTime() {
        return spCreateTime;
    }

    /**
     * 创建时间
     * @param spCreateTime 创建时间
     */
    public void setSpCreateTime(Date spCreateTime) {
        this.spCreateTime = spCreateTime;
    }

    /**
     * 修改时间
     * @return sp_update_time 修改时间
     */
    public Date getSpUpdateTime() {
        return spUpdateTime;
    }

    /**
     * 修改时间
     * @param spUpdateTime 修改时间
     */
    public void setSpUpdateTime(Date spUpdateTime) {
        this.spUpdateTime = spUpdateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", spId=").append(spId);
        sb.append(", spName=").append(spName);
        sb.append(", spUri=").append(spUri);
        sb.append(", spType=").append(spType);
        sb.append(", spParentId=").append(spParentId);
        sb.append(", spCreateTime=").append(spCreateTime);
        sb.append(", spUpdateTime=").append(spUpdateTime);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SysPrivilege other = (SysPrivilege) that;
        return (this.getSpId() == null ? other.getSpId() == null : this.getSpId().equals(other.getSpId()))
            && (this.getSpName() == null ? other.getSpName() == null : this.getSpName().equals(other.getSpName()))
            && (this.getSpUri() == null ? other.getSpUri() == null : this.getSpUri().equals(other.getSpUri()))
            && (this.getSpType() == null ? other.getSpType() == null : this.getSpType().equals(other.getSpType()))
            && (this.getSpParentId() == null ? other.getSpParentId() == null : this.getSpParentId().equals(other.getSpParentId()))
            && (this.getSpCreateTime() == null ? other.getSpCreateTime() == null : this.getSpCreateTime().equals(other.getSpCreateTime()))
            && (this.getSpUpdateTime() == null ? other.getSpUpdateTime() == null : this.getSpUpdateTime().equals(other.getSpUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSpId() == null) ? 0 : getSpId().hashCode());
        result = prime * result + ((getSpName() == null) ? 0 : getSpName().hashCode());
        result = prime * result + ((getSpUri() == null) ? 0 : getSpUri().hashCode());
        result = prime * result + ((getSpType() == null) ? 0 : getSpType().hashCode());
        result = prime * result + ((getSpParentId() == null) ? 0 : getSpParentId().hashCode());
        result = prime * result + ((getSpCreateTime() == null) ? 0 : getSpCreateTime().hashCode());
        result = prime * result + ((getSpUpdateTime() == null) ? 0 : getSpUpdateTime().hashCode());
        return result;
    }
}