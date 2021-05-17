package cn.ke1an.suvue.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 角色权限关联
 *
 * @author zhaokeyan
 * @date 2021/05/17 16:30
 */
@Data
@Builder
@TableName("sv_role_permission")
@AllArgsConstructor
@NoArgsConstructor
public class SvRolePermission {
    /**
     * 角色ID
     */
    @TableField("role_id")
    private Long roleId;

    /**
     * 权限ID
     */
    @TableField("permission_id")
    private Long permissionId;
}