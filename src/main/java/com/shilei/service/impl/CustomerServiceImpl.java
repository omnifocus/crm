package com.shilei.service.impl;

import com.shilei.bean.Customer;
import com.shilei.mapper.CustomerMapper;
import com.shilei.service.CustomerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shilei.util.QueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lei
 * @since 2021-03-13
 */
@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements CustomerService {

    @Autowired
    CustomerMapper mapper;

    @Override
    public Integer selectCustomersCountByCondition(QueryVo vo) {
        return mapper.selectCustomersCountByCondition(vo);
    }

    @Override
    public List<Customer> selectCustomersByCondition(QueryVo vo) {
        return mapper.selectCustomersByCondition(vo);
    }
}
