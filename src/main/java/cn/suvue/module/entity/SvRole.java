package cn.suvue.module.entity;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sv_role
 */
public class SvRole {
    /**
     * Database Column Remarks:
     *   主键
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sv_role.id
     *
     * @mbg.generated Wed Jun 02 23:11:42 CST 2021
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   角色名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sv_role.name
     *
     * @mbg.generated Wed Jun 02 23:11:42 CST 2021
     */
    private String name;

    /**
     * Database Column Remarks:
     *   描述
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sv_role.description
     *
     * @mbg.generated Wed Jun 02 23:11:42 CST 2021
     */
    private String description;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sv_role.create_time
     *
     * @mbg.generated Wed Jun 02 23:11:42 CST 2021
     */
    private Long createTime;

    /**
     * Database Column Remarks:
     *   更新时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sv_role.last_update_time
     *
     * @mbg.generated Wed Jun 02 23:11:42 CST 2021
     */
    private Long lastUpdateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sv_role.id
     *
     * @return the value of sv_role.id
     *
     * @mbg.generated Wed Jun 02 23:11:42 CST 2021
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sv_role.id
     *
     * @param id the value for sv_role.id
     *
     * @mbg.generated Wed Jun 02 23:11:42 CST 2021
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sv_role.name
     *
     * @return the value of sv_role.name
     *
     * @mbg.generated Wed Jun 02 23:11:42 CST 2021
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sv_role.name
     *
     * @param name the value for sv_role.name
     *
     * @mbg.generated Wed Jun 02 23:11:42 CST 2021
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sv_role.description
     *
     * @return the value of sv_role.description
     *
     * @mbg.generated Wed Jun 02 23:11:42 CST 2021
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sv_role.description
     *
     * @param description the value for sv_role.description
     *
     * @mbg.generated Wed Jun 02 23:11:42 CST 2021
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sv_role.create_time
     *
     * @return the value of sv_role.create_time
     *
     * @mbg.generated Wed Jun 02 23:11:42 CST 2021
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sv_role.create_time
     *
     * @param createTime the value for sv_role.create_time
     *
     * @mbg.generated Wed Jun 02 23:11:42 CST 2021
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sv_role.last_update_time
     *
     * @return the value of sv_role.last_update_time
     *
     * @mbg.generated Wed Jun 02 23:11:42 CST 2021
     */
    public Long getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sv_role.last_update_time
     *
     * @param lastUpdateTime the value for sv_role.last_update_time
     *
     * @mbg.generated Wed Jun 02 23:11:42 CST 2021
     */
    public void setLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}