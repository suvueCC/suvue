package cn.suvue.module.service.impl;

import cn.hutool.core.collection.CollUtil;
import cn.suvue.module.mapper.SvPermissionMapperEx;
import cn.suvue.module.mapper.SvRoleMapperEx;
import cn.suvue.module.entity.SvPermission;
import cn.suvue.module.entity.SvRole;
import cn.suvue.module.entity.SvUser;
import cn.suvue.module.entity.SvUserExample;
import cn.suvue.module.mapper.example.SvUserMapper;
import cn.suvue.module.model.UserPrincipal;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 自定义UserDetails查询
 *
 * @author suvuecc
 * @date 2021/05/12 21:09
 */
@Service
@AllArgsConstructor
public class CustomUserDetailsServiceImpl implements UserDetailsService {
    private final SvUserMapper svUserMapper;
    private final SvRoleMapperEx svRoleMapperEx;
    private final SvPermissionMapperEx svPermissionMapperEx;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SvUserExample userExample = new SvUserExample();
        userExample.createCriteria().andUsernameEqualTo(username);
        List<SvUser> userList = svUserMapper.selectByExample(userExample);
        if (CollUtil.isEmpty(userList)) {
            throw new UsernameNotFoundException("未找到用户信息 : " + username);
        }
        SvUser user = userList.get(0);
        List<SvRole> roles = svRoleMapperEx.selectByUserId(user.getId());
        List<Long> roleIds = roles.stream().map(SvRole::getId).collect(Collectors.toList());
        List<SvPermission> permissions = svPermissionMapperEx.selectByRoleIds(roleIds);
        return UserPrincipal.create(user, roles, permissions);
    }
}
