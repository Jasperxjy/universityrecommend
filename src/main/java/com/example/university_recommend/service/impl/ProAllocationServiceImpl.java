package com.example.university_recommend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.university_recommend.dao.ProAllocationDao;
import com.example.university_recommend.entity.ProAllocation;
import com.example.university_recommend.service.ProAllocationService;
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

