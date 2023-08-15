package com.sky.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sky.domain.AddressBook;
import com.sky.service.AddressBookService;
import com.sky.mapper.AddressBookMapper;
import org.springframework.stereotype.Service;

/**
* @author Payment
* @description 针对表【address_book(地址簿)】的数据库操作Service实现
* @createDate 2023-08-15 17:23:05
*/
@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook>
    implements AddressBookService{

}




