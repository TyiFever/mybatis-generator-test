package com.quiterr.dao;

import com.quiterr.model.Devices;
import com.quiterr.model.DevicesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DevicesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table devices
     *
     * @mbggenerated
     */
    int countByExample(DevicesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table devices
     *
     * @mbggenerated
     */
    int deleteByExample(DevicesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table devices
     *
     * @mbggenerated
     */
    int insert(Devices record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table devices
     *
     * @mbggenerated
     */
    int insertSelective(Devices record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table devices
     *
     * @mbggenerated
     */
    List<Devices> selectByExample(DevicesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table devices
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Devices record, @Param("example") DevicesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table devices
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Devices record, @Param("example") DevicesExample example);
}