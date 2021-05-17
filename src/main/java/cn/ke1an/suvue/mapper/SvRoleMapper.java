package cn.ke1an.suvue.mapper;

import cn.ke1an.suvue.entity.SvRole;
import cn.ke1an.suvue.entity.SvUserRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 角色
 *
 * @author zhaokeyan
 * @date 2021/05/17 16:01
 */
@Component
public interface SvRoleMapper extends BaseMapper<SvRole> {

    /**
     * 根据用户ID查询角色列表
     *
     * @param userId 用户ID
     * @return java.util.List<cn.ke1an.suvue.entity.SvRole>
     * @author zhaokeyan
     * @date 2021/5/17 8:45 下午
     */
    List<SvRole> selectByUserId(@Param("userId") Long userId);
}
