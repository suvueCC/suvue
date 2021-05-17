package cn.ke1an.suvue.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户角色关联表
 *
 * @author zhaokeyan
 * @date 2021/05/17 15:41
 */
@Data
@Builder
@TableName("sv_user_role")
@NoArgsConstructor
@AllArgsConstructor
public class SvUserRole {

    /**
     * 用户ID
     */
    @TableField(value = "user_id")
    private Long userId;

    /**
     * 角色ID
     */
    @TableField(value = "role_id")
    private Long roleId;
}