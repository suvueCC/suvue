package cn.suvue.module.mapper.example;

import cn.suvue.module.entity.SvRole;
import cn.suvue.module.entity.SvRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SvRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sv_role
     *
     * @mbg.generated Wed Jun 02 23:11:42 CST 2021
     */
    long countByExample(SvRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sv_role
     *
     * @mbg.generated Wed Jun 02 23:11:42 CST 2021
     */
    int deleteByExample(SvRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sv_role
     *
     * @mbg.generated Wed Jun 02 23:11:42 CST 2021
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sv_role
     *
     * @mbg.generated Wed Jun 02 23:11:42 CST 2021
     */
    int insert(SvRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sv_role
     *
     * @mbg.generated Wed Jun 02 23:11:42 CST 2021
     */
    int insertSelective(SvRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sv_role
     *
     * @mbg.generated Wed Jun 02 23:11:42 CST 2021
     */
    List<SvRole> selectByExample(SvRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sv_role
     *
     * @mbg.generated Wed Jun 02 23:11:42 CST 2021
     */
    SvRole selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sv_role
     *
     * @mbg.generated Wed Jun 02 23:11:42 CST 2021
     */
    int updateByExampleSelective(@Param("record") SvRole record, @Param("example") SvRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sv_role
     *
     * @mbg.generated Wed Jun 02 23:11:42 CST 2021
     */
    int updateByExample(@Param("record") SvRole record, @Param("example") SvRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sv_role
     *
     * @mbg.generated Wed Jun 02 23:11:42 CST 2021
     */
    int updateByPrimaryKeySelective(SvRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sv_role
     *
     * @mbg.generated Wed Jun 02 23:11:42 CST 2021
     */
    int updateByPrimaryKey(SvRole record);
}