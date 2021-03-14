package com.shilei.mapper;

import com.shilei.bean.Customer;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shilei.util.QueryVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lei
 * @since 2021-03-13
 */
@Mapper
public interface CustomerMapper extends BaseMapper<Customer> {

    Integer selectCustomersCountByCondition(QueryVo vo);

    List<Customer> selectCustomersByCondition(QueryVo vo);
}
