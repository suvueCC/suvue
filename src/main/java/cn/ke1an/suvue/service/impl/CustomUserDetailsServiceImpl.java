package cn.ke1an.suvue.service.impl;

import cn.hutool.core.collection.CollUtil;
import cn.ke1an.suvue.entity.SvPermission;
import cn.ke1an.suvue.entity.SvRole;
import cn.ke1an.suvue.entity.SvUser;
import cn.ke1an.suvue.mapper.SvPermissionMapper;
import cn.ke1an.suvue.mapper.SvRoleMapper;
import cn.ke1an.suvue.mapper.SvUserMapper;
import cn.ke1an.suvue.vo.UserPrincipal;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 * 自定义UserDetails查询
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2018-12-10 10:29
 */
@Service
@AllArgsConstructor
public class CustomUserDetailsServiceImpl implements UserDetailsService {
    private final SvUserMapper svUserMapper;
    private final SvRoleMapper svRoleMapper;
    private final SvPermissionMapper svPermissionMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<SvUser> userList = svUserMapper.selectList(new QueryWrapper<SvUser>().eq("username", username));
        if (CollUtil.isEmpty(userList)) {
            throw new UsernameNotFoundException("未找到用户信息 : " + username);
        }
        SvUser user = userList.get(0);
        List<SvRole> roles = svRoleMapper.selectByUserId(user.getId());
        List<Long> roleIds = roles.stream().map(SvRole::getId).collect(Collectors.toList());
        List<SvPermission> permissions = svPermissionMapper.selectByRoleIds(roleIds);
        return UserPrincipal.create(user, roles, permissions);
    }
}
