package cn.ke1an.suvue.mapper;

import cn.ke1an.suvue.entity.SvPermission;
import cn.ke1an.suvue.entity.SvRolePermission;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 权限
 *
 * @author zhaokeyan
 * @date 2021/05/17 16:01
 */
@Component
public interface SvPermissionMapper extends BaseMapper<SvPermission> {

    /**
     * 根据角色ID查询权限列表
     *
     * @param roleIds 角色id列表
     * @return java.util.List<cn.ke1an.suvue.entity.SvPermission>
     * @author zhaokeyan
     * @date 2021/5/17 8:44 下午
     */
    List<SvPermission> selectByRoleIds(@Param("roleIds") List<Long> roleIds);
}
