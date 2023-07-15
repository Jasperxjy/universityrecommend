package com.university_recommend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.university_recommend.dao.UniversitiesDao;
import com.university_recommend.entity.Universities;
import com.university_recommend.service.UniversitiesService;
import org.springframework.stereotype.Service;

/**
 * (Universities)表服务实现类
 *
 * @author makejava
 * @since 2023-07-14 23:18:10
 */
@Service("universitiesService")
public class UniversitiesServiceImpl extends ServiceImpl<UniversitiesDao, Universities> implements UniversitiesService {

}

