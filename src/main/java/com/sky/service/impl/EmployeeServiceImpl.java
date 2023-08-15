package com.sky.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sky.domain.Employee;
import com.sky.service.EmployeeService;
import com.sky.mapper.EmployeeMapper;
import org.springframework.stereotype.Service;

/**
* @author Payment
* @description 针对表【employee(员工信息)】的数据库操作Service实现
* @createDate 2023-08-15 17:23:05
*/
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee>
    implements EmployeeService{

}




