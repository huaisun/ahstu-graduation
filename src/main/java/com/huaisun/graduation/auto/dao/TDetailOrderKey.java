package com.huaisun.graduation.auto.dao;

public class TDetailOrderKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_detail_order.o_id
     *
     * @mbg.generated Sun Apr 21 15:09:34 CST 2019
     */
    private String oId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_detail_order.m_id
     *
     * @mbg.generated Sun Apr 21 15:09:34 CST 2019
     */
    private Integer mId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_detail_order.o_id
     *
     * @return the value of t_detail_order.o_id
     *
     * @mbg.generated Sun Apr 21 15:09:34 CST 2019
     */
    public String getoId() {
        return oId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_detail_order.o_id
     *
     * @param oId the value for t_detail_order.o_id
     *
     * @mbg.generated Sun Apr 21 15:09:34 CST 2019
     */
    public void setoId(String oId) {
        this.oId = oId == null ? null : oId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_detail_order.m_id
     *
     * @return the value of t_detail_order.m_id
     *
     * @mbg.generated Sun Apr 21 15:09:34 CST 2019
     */
    public Integer getmId() {
        return mId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_detail_order.m_id
     *
     * @param mId the value for t_detail_order.m_id
     *
     * @mbg.generated Sun Apr 21 15:09:34 CST 2019
     */
    public void setmId(Integer mId) {
        this.mId = mId;
    }
}