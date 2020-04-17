package com.teacher.dao;




import java.util.List;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.teacher.entity.Api;

/**
 * 功能描述: 考勤的dao
 *
 * @auther: njw
 * @date: 2018/7/30
 */
@Mapper
public interface ApiDao {

		@Select("select  id,Name,EnrollNumber,Time,VerifyMode,InOutMode from kq order by id")
		List<Api> findList();
		
		
		@Insert("INSERT  INTO `kq`  (Name,EnrollNumber,Time,VerifyMode,InOutMode) VALUES (#{Name},#{EnrollNumber},#{Time},#{VerifyMode},#{InOutMode});")
		Integer insertPai(Api api);
		
		@Select("select  id,Name,EnrollNumber,Time,VerifyMode,InOutMode from kq where Time=#{Time}")
		Api findByTime(@Param("Time") Object Time);
		

		
}