package com.university_recommend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.university_recommend.dao.ProAllocationDao;
import com.university_recommend.entity.ProAllocation;
import com.university_recommend.service.ProAllocationService;
import org.springframework.stereotype.Service;

/**
 * (ProAllocation)表服务实现类
 *
 * @author makejava
 * @since 2023-07-14 23:17:00
 */
@Service("proAllocationService")
public class ProAllocationServiceImpl extends ServiceImpl<ProAllocationDao, ProAllocation> implements ProAllocationService {

}

