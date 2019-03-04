package com.huaisun.graduation.auto.dao;

import java.util.Date;

public class TOrder extends TOrderKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.U_ID
     *
     * @mbg.generated Mon Mar 04 13:15:49 CST 2019
     */
    private Integer uId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.CREATE_DATE
     *
     * @mbg.generated Mon Mar 04 13:15:49 CST 2019
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.MODE
     *
     * @mbg.generated Mon Mar 04 13:15:49 CST 2019
     */
    private String mode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.VALID
     *
     * @mbg.generated Mon Mar 04 13:15:49 CST 2019
     */
    private String valid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.PRICE
     *
     * @mbg.generated Mon Mar 04 13:15:49 CST 2019
     */
    private Float price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.COUNT
     *
     * @mbg.generated Mon Mar 04 13:15:49 CST 2019
     */
    private Integer count;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.COST
     *
     * @mbg.generated Mon Mar 04 13:15:49 CST 2019
     */
    private Float cost;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.PAYMENT
     *
     * @mbg.generated Mon Mar 04 13:15:49 CST 2019
     */
    private Float payment;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.U_ID
     *
     * @return the value of t_order.U_ID
     *
     * @mbg.generated Mon Mar 04 13:15:49 CST 2019
     */
    public Integer getuId() {
        return uId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.U_ID
     *
     * @param uId the value for t_order.U_ID
     *
     * @mbg.generated Mon Mar 04 13:15:49 CST 2019
     */
    public void setuId(Integer uId) {
        this.uId = uId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.CREATE_DATE
     *
     * @return the value of t_order.CREATE_DATE
     *
     * @mbg.generated Mon Mar 04 13:15:49 CST 2019
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.CREATE_DATE
     *
     * @param createDate the value for t_order.CREATE_DATE
     *
     * @mbg.generated Mon Mar 04 13:15:49 CST 2019
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.MODE
     *
     * @return the value of t_order.MODE
     *
     * @mbg.generated Mon Mar 04 13:15:49 CST 2019
     */
    public String getMode() {
        return mode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.MODE
     *
     * @param mode the value for t_order.MODE
     *
     * @mbg.generated Mon Mar 04 13:15:49 CST 2019
     */
    public void setMode(String mode) {
        this.mode = mode == null ? null : mode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.VALID
     *
     * @return the value of t_order.VALID
     *
     * @mbg.generated Mon Mar 04 13:15:49 CST 2019
     */
    public String getValid() {
        return valid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.VALID
     *
     * @param valid the value for t_order.VALID
     *
     * @mbg.generated Mon Mar 04 13:15:49 CST 2019
     */
    public void setValid(String valid) {
        this.valid = valid == null ? null : valid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.PRICE
     *
     * @return the value of t_order.PRICE
     *
     * @mbg.generated Mon Mar 04 13:15:49 CST 2019
     */
    public Float getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.PRICE
     *
     * @param price the value for t_order.PRICE
     *
     * @mbg.generated Mon Mar 04 13:15:49 CST 2019
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.COUNT
     *
     * @return the value of t_order.COUNT
     *
     * @mbg.generated Mon Mar 04 13:15:49 CST 2019
     */
    public Integer getCount() {
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.COUNT
     *
     * @param count the value for t_order.COUNT
     *
     * @mbg.generated Mon Mar 04 13:15:49 CST 2019
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.COST
     *
     * @return the value of t_order.COST
     *
     * @mbg.generated Mon Mar 04 13:15:49 CST 2019
     */
    public Float getCost() {
        return cost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.COST
     *
     * @param cost the value for t_order.COST
     *
     * @mbg.generated Mon Mar 04 13:15:49 CST 2019
     */
    public void setCost(Float cost) {
        this.cost = cost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.PAYMENT
     *
     * @return the value of t_order.PAYMENT
     *
     * @mbg.generated Mon Mar 04 13:15:49 CST 2019
     */
    public Float getPayment() {
        return payment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.PAYMENT
     *
     * @param payment the value for t_order.PAYMENT
     *
     * @mbg.generated Mon Mar 04 13:15:49 CST 2019
     */
    public void setPayment(Float payment) {
        this.payment = payment;
    }
}