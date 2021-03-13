package com.shilei.service.impl;

import com.shilei.bean.Customer;
import com.shilei.mapper.CustomerMapper;
import com.shilei.service.CustomerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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

}
