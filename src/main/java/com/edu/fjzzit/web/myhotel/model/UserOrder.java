package com.edu.fjzzit.web.myhotel.model;

public class UserOrder {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_order.user_order_num
     *
     * @mbggenerated
     */
    private Long userOrderNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_order.user_id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_order.room_order_num
     *
     * @mbggenerated
     */
    private Long roomOrderNum;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_order.user_order_num
     *
     * @return the value of user_order.user_order_num
     *
     * @mbggenerated
     */
    public Long getUserOrderNum() {
        return userOrderNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_order.user_order_num
     *
     * @param userOrderNum the value for user_order.user_order_num
     *
     * @mbggenerated
     */
    public void setUserOrderNum(Long userOrderNum) {
        this.userOrderNum = userOrderNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_order.user_id
     *
     * @return the value of user_order.user_id
     *
     * @mbggenerated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_order.user_id
     *
     * @param userId the value for user_order.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_order.room_order_num
     *
     * @return the value of user_order.room_order_num
     *
     * @mbggenerated
     */
    public Long getRoomOrderNum() {
        return roomOrderNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_order.room_order_num
     *
     * @param roomOrderNum the value for user_order.room_order_num
     *
     * @mbggenerated
     */
    public void setRoomOrderNum(Long roomOrderNum) {
        this.roomOrderNum = roomOrderNum;
    }
}