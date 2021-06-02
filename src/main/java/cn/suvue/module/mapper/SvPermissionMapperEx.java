package cn.suvue.module.mapper;

import cn.suvue.module.entity.SvPermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 权限
 *
 * @author suvuecc
 * @date 2021/05/17 16:01
 */
public interface SvPermissionMapperEx {

    /**
     * 根据角色ID查询权限列表
     *
     * @param roleIds 角色id列表
     * @return java.util.List<cn.suvue.entity.SvPermission>
     * @author suvuecc
     * @date 2021/5/17 8:44 下午
     */
    List<SvPermission> selectByRoleIds(@Param("roleIds") List<Long> roleIds);
}
