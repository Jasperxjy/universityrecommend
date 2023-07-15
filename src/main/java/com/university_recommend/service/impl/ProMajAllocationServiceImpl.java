package com.university_recommend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.university_recommend.dao.ProMajAllocationDao;
import com.university_recommend.entity.ProMajAllocation;
import com.university_recommend.service.ProMajAllocationService;
import org.springframework.stereotype.Service;

/**
 * (ProMajAllocation)表服务实现类
 *
 * @author makejava
 * @since 2023-07-14 23:17:33
 */
@Service("proMajAllocationService")
public class ProMajAllocationServiceImpl extends ServiceImpl<ProMajAllocationDao, ProMajAllocation> implements ProMajAllocationService {

}

