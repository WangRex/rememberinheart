package com.rmbih.dao;

import com.rmbih.model.RmbihUserT;
import com.rmbih.model.RmbihUserTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RmbihUserTMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rmbih_user_t
     *
     * @mbggenerated
     */
    int countByExample(RmbihUserTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rmbih_user_t
     *
     * @mbggenerated
     */
    int deleteByExample(RmbihUserTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rmbih_user_t
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rmbih_user_t
     *
     * @mbggenerated
     */
    int insert(RmbihUserT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rmbih_user_t
     *
     * @mbggenerated
     */
    int insertSelective(RmbihUserT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rmbih_user_t
     *
     * @mbggenerated
     */
    List<RmbihUserT> selectByExample(RmbihUserTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rmbih_user_t
     *
     * @mbggenerated
     */
    RmbihUserT selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rmbih_user_t
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") RmbihUserT record, @Param("example") RmbihUserTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rmbih_user_t
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") RmbihUserT record, @Param("example") RmbihUserTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rmbih_user_t
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(RmbihUserT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rmbih_user_t
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(RmbihUserT record);
}