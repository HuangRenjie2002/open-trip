package org.huang.trip.service.impl;

import org.huang.trip.pojo.entity.User;
import org.huang.trip.mapper.UserMapper;
import org.huang.trip.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Pluto
 * @since 2024-01-27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
