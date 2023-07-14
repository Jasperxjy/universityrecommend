package com.example.university_recommend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.university_recommend.dao.MajorDao;
import com.example.university_recommend.entity.Major;
import com.example.university_recommend.service.MajorService;
import org.springframework.stereotype.Service;

/**
 * (Major)表服务实现类
 *
 * @author makejava
 * @since 2023-07-14 23:15:49
 */
@Service("majorService")
public class MajorServiceImpl extends ServiceImpl<MajorDao, Major> implements MajorService {

}

