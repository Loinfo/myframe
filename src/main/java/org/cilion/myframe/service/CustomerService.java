package org.cilion.myframe.service;

import org.cilion.myframe.helper.DatabaseHelper;
import org.cilion.myframe.model.Customer;
import org.cilion.myframe.util.PropsUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @Auther: liangxin
 * @Date: 2018/10/19
 * @Description:提供客户数据服务
 */
public class CustomerService {
    private static final Logger logger = LoggerFactory.getLogger(CustomerService.class);

    /**
     * 获取客户列表
     * @return
     */
    public List<Customer> getCustomerList(){
        String sql = "SELECT * FROM customer";
        List<Customer> customerList = DatabaseHelper.queryEntityList(Customer.class, sql);
        return customerList;
    }

    /**
     * 获取客户
     * @param id
     * @return
     */
    public Customer getCustomer(long id){
        //TODO
        String sql = "SELECT * FROM customer where id = ?";
        List result = DatabaseHelper.executeQuery(sql, id);
        return new Customer();
    }

    /**
     * 创建客户
     * @param fieldMap
     * @return
     */
    public boolean createCustomer(Map<String, Object> fieldMap){
        return DatabaseHelper.insertEntity(Customer.class, fieldMap);
    }

    /**
     * 更新客户
     * @param id
     * @param fieldMap
     * @return
     */
    public boolean updateCustomer(long id, Map<String, Object> fieldMap){
        return DatabaseHelper.updateEntity(Customer.class, id, fieldMap);
    }

    /**
     * 删除客户
     * @param id
     * @return
     */
    public boolean deleteCustomer(long id){
        return DatabaseHelper.deleteEntity(Customer.class, id);
    }
}
