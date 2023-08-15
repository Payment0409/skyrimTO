package com.sky.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sky.domain.ShoppingCart;
import com.sky.service.ShoppingCartService;
import com.sky.mapper.ShoppingCartMapper;
import org.springframework.stereotype.Service;

/**
* @author Payment
* @description 针对表【shopping_cart(购物车)】的数据库操作Service实现
* @createDate 2023-08-15 17:23:05
*/
@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart>
    implements ShoppingCartService{

}




