package com.huaisun.graduation.auto.mapper;

import com.huaisun.graduation.auto.dao.TCart;
import com.huaisun.graduation.auto.dao.TCartExample;
import com.huaisun.graduation.auto.dao.TCartKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCartMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cart
     *
     * @mbg.generated Fri Apr 19 23:21:32 CST 2019
     */
    long countByExample(TCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cart
     *
     * @mbg.generated Fri Apr 19 23:21:32 CST 2019
     */
    int deleteByExample(TCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cart
     *
     * @mbg.generated Fri Apr 19 23:21:32 CST 2019
     */
    int deleteByPrimaryKey(TCartKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cart
     *
     * @mbg.generated Fri Apr 19 23:21:32 CST 2019
     */
    int insert(TCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cart
     *
     * @mbg.generated Fri Apr 19 23:21:32 CST 2019
     */
    int insertSelective(TCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cart
     *
     * @mbg.generated Fri Apr 19 23:21:32 CST 2019
     */
    List<TCart> selectByExample(TCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cart
     *
     * @mbg.generated Fri Apr 19 23:21:32 CST 2019
     */
    TCart selectByPrimaryKey(TCartKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cart
     *
     * @mbg.generated Fri Apr 19 23:21:32 CST 2019
     */
    int updateByExampleSelective(@Param("record") TCart record, @Param("example") TCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cart
     *
     * @mbg.generated Fri Apr 19 23:21:32 CST 2019
     */
    int updateByExample(@Param("record") TCart record, @Param("example") TCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cart
     *
     * @mbg.generated Fri Apr 19 23:21:32 CST 2019
     */
    int updateByPrimaryKeySelective(TCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cart
     *
     * @mbg.generated Fri Apr 19 23:21:32 CST 2019
     */
    int updateByPrimaryKey(TCart record);
}