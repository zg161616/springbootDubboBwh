package com.example.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import service.StudentService;


/**
 * 帐号Service实现类
 * @author Administrator
 *
 */
@Service(version = "1.0.0")
public class StudentServiceImpl implements StudentService {


	@Override
	public String info(int id) {
		return "菜";
	}
}
