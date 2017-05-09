package org.spring.boot.service.ipml;

import java.util.Date;
import java.util.List;

import org.spring.boot.common.PagehelperUtils;
import org.spring.boot.dao.UserInfoMapper;
import org.spring.boot.po.UserInfo;
import org.spring.boot.po.UserInfoExample;
import org.spring.boot.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class UserInfoServiceImpl implements IUserInfoService {
	@Autowired
	private UserInfoMapper userInfoMapper;
	@SuppressWarnings("rawtypes")
	@Override
	public PagehelperUtils listUser() {
		PageHelper.startPage(1, 2, true);
		UserInfoExample example = new UserInfoExample();
		List<UserInfo> list = this.userInfoMapper.selectByExample(example);
		@SuppressWarnings("unchecked")
		PageInfo pageInfo = new PageInfo(list); 
		return new PagehelperUtils(pageInfo);
	}
	@Transactional
	@Override
	public void insert() {
		UserInfo info = new UserInfo();
		info.setGovCode("111122");
		info.setUserName("test-boot2");
		info.setUserCode("090909092");
		info.setUserPassword("test-pawd2");
		info.setCreateTime(new Date());
		info.setUpdateTime(new Date());
		int index = userInfoMapper.insertSelective(info);
		System.out.println(index);
		throw new RuntimeException();
	}

}
