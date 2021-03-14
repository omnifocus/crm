package com.shilei.service;

import com.shilei.bean.Customer;
import com.baomidou.mybatisplus.extension.service.IService;
import com.shilei.util.QueryVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lei
 * @since 2021-03-13
 */
public interface CustomerService extends IService<Customer> {
    Integer selectCustomersCountByCondition(QueryVo vo);
    List<Customer> selectCustomersByCondition(QueryVo vo);
}
