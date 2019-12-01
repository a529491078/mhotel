package com.edu.fjzzit.web.myhotel.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CheckInInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column check_in_info.check_in_num
     *
     * @mbggenerated
     */
    private Long checkInNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column check_in_info.customer_name
     *
     * @mbggenerated
     */
    private String customerName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column check_in_info.customer_phone
     *
     * @mbggenerated
     */
    private String customerPhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column check_in_info.roon_num
     *
     * @mbggenerated
     */
    private String roomNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column check_in_info.customer_ID
     *
     * @mbggenerated
     */
    private String customerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column check_in_info.check_in_state
     *
     * @mbggenerated
     */
    private Integer checkInState;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column check_in_info.check_in_num
     *
     * @return the value of check_in_info.check_in_num
     *
     * @mbggenerated
     */
    public Long getCheckInNum() {
        return checkInNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column check_in_info.check_in_num
     *
     * @param checkInNum the value for check_in_info.check_in_num
     *
     * @mbggenerated
     */
    public void setCheckInNum(Long checkInNum) {
        this.checkInNum = checkInNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column check_in_info.customer_name
     *
     * @return the value of check_in_info.customer_name
     *
     * @mbggenerated
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column check_in_info.customer_name
     *
     * @param customerName the value for check_in_info.customer_name
     *
     * @mbggenerated
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column check_in_info.customer_phone
     *
     * @return the value of check_in_info.customer_phone
     *
     * @mbggenerated
     */
    public String getCustomerPhone() {
        return customerPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column check_in_info.customer_phone
     *
     * @param customerPhone the value for check_in_info.customer_phone
     *
     * @mbggenerated
     */
    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column check_in_info.roon_num
     *
     * @return the value of check_in_info.roon_num
     *
     * @mbggenerated
     */
    public String getRoomNum() {
        return roomNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column check_in_info.roon_num
     *
     * @param roomNum the value for check_in_info.roon_num
     *
     * @mbggenerated
     */
    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column check_in_info.customer_ID
     *
     * @return the value of check_in_info.customer_ID
     *
     * @mbggenerated
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column check_in_info.customer_ID
     *
     * @param customerId the value for check_in_info.customer_ID
     *
     * @mbggenerated
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column check_in_info.check_in_state
     *
     * @return the value of check_in_info.check_in_state
     *
     * @mbggenerated
     */
    public Integer getCheckInState() {
        return checkInState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column check_in_info.check_in_state
     *
     * @param checkInState the value for check_in_info.check_in_state
     *
     * @mbggenerated
     */
    public void setCheckInState(Integer checkInState) {
        this.checkInState = checkInState;
    }
}