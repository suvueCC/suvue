package cn.ke1an.suvue.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 角色
 *
 * @author zhaokeyan
 * @date 2021/05/17 16:25
 */
@Data
@Builder
@TableName("sv_role")
@AllArgsConstructor
@NoArgsConstructor
public class SvRole {
    /**
     * 主键
     */
    @TableId
    private Long id;

    /**
     * 角色名
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private Long createTime;

    /**
     * 更新时间
     */
    @TableField("last_update_time")
    private Long lastUpdateTime;
}