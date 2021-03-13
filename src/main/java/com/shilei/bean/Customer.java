package com.shilei.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author lei
 * @since 2021-03-13
 */
public class Customer implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 客户编号(主键)
     */
    @TableId(value = "cust_id", type = IdType.AUTO)
    private Long custId;

    /**
     * 客户名称(公司名称)
     */
    private String custName;

    /**
     * 负责人id
     */
    private Long custUserId;

    /**
     * 创建人id
     */
    private Long custCreateId;

    /**
     * 客户信息来源
     */
    private String custSource;

    /**
     * 客户所属行业
     */
    private String custIndustry;

    /**
     * 客户级别
     */
    private String custLevel;

    /**
     * 联系人
     */
    private String custLinkman;

    /**
     * 固定电话
     */
    private String custPhone;

    /**
     * 移动电话
     */
    private String custMobile;

    private String custZipcode;

    private String custAddress;

    /**
     * 创建时间
     */
    private LocalDateTime custCreatetime;


    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public Long getCustUserId() {
        return custUserId;
    }

    public void setCustUserId(Long custUserId) {
        this.custUserId = custUserId;
    }

    public Long getCustCreateId() {
        return custCreateId;
    }

    public void setCustCreateId(Long custCreateId) {
        this.custCreateId = custCreateId;
    }

    public String getCustSource() {
        return custSource;
    }

    public void setCustSource(String custSource) {
        this.custSource = custSource;
    }

    public String getCustIndustry() {
        return custIndustry;
    }

    public void setCustIndustry(String custIndustry) {
        this.custIndustry = custIndustry;
    }

    public String getCustLevel() {
        return custLevel;
    }

    public void setCustLevel(String custLevel) {
        this.custLevel = custLevel;
    }

    public String getCustLinkman() {
        return custLinkman;
    }

    public void setCustLinkman(String custLinkman) {
        this.custLinkman = custLinkman;
    }

    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }

    public String getCustMobile() {
        return custMobile;
    }

    public void setCustMobile(String custMobile) {
        this.custMobile = custMobile;
    }

    public String getCustZipcode() {
        return custZipcode;
    }

    public void setCustZipcode(String custZipcode) {
        this.custZipcode = custZipcode;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public LocalDateTime getCustCreatetime() {
        return custCreatetime;
    }

    public void setCustCreatetime(LocalDateTime custCreatetime) {
        this.custCreatetime = custCreatetime;
    }

    @Override
    public String toString() {
        return "Customer{" +
        "custId=" + custId +
        ", custName=" + custName +
        ", custUserId=" + custUserId +
        ", custCreateId=" + custCreateId +
        ", custSource=" + custSource +
        ", custIndustry=" + custIndustry +
        ", custLevel=" + custLevel +
        ", custLinkman=" + custLinkman +
        ", custPhone=" + custPhone +
        ", custMobile=" + custMobile +
        ", custZipcode=" + custZipcode +
        ", custAddress=" + custAddress +
        ", custCreatetime=" + custCreatetime +
        "}";
    }
}
