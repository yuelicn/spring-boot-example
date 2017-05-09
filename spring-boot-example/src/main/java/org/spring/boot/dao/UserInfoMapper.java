package org.spring.boot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.spring.boot.po.UserInfo;
import org.spring.boot.po.UserInfoExample;
@Mapper
public interface UserInfoMapper {
    int countByExample(UserInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    List<UserInfo> selectByExample(UserInfoExample example);

    UserInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);


    int deleteByUserCode(String userCode);

    int deleteByGovCode(String govCode);
}