package com.example.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import dao.StudentDao;
import entity.Student;
import org.springframework.stereotype.Component;
import service.StudentService;

import javax.annotation.Resource;
import java.util.Optional;


/**
 * 帐号Service实现类
 * @author Administrator
 *
 */
@Service(version = "1.0.0")
public class StudentServiceImpl implements StudentService {
	@Resource
	StudentDao studentDao;

	@Override
	public String info(int id) {
		Optional<Student> byId = studentDao.findById(id);
		return byId.get().toString();
	}
}
