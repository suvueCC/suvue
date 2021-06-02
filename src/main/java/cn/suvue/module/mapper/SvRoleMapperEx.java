package cn.suvue.module.mapper;

import cn.suvue.module.entity.SvRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 角色
 *
 * @author suvuecc
 * @date 2021/05/17 16:01
 */
public interface SvRoleMapperEx {

    /**
     * 根据用户ID查询角色列表
     *
     * @param userId 用户ID
     * @return java.util.List<cn.suvue.entity.SvRole>
     * @author suvuecc
     * @date 2021/5/17 8:45 下午
     */
    List<SvRole> selectByUserId(@Param("userId") Long userId);
}
