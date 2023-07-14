package com.example.university_recommend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.university_recommend.dao.ProvincesDao;
import com.example.university_recommend.entity.Provinces;
import com.example.university_recommend.service.ProvincesService;
import org.springframework.stereotype.Service;

/**
 * (Provinces)表服务实现类
 *
 * @author makejava
 * @since 2023-07-14 23:17:54
 */
@Service("provincesService")
public class ProvincesServiceImpl extends ServiceImpl<ProvincesDao, Provinces> implements ProvincesService {

}

