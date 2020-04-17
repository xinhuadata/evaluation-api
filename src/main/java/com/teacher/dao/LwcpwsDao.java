package com.teacher.dao;


import com.teacher.entity.Api;
import com.teacher.entity.Lwcpws;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 功能描述: 考勤的dao
 *
 * @auther: njw
 * @date: 2018/7/30
 */
@Mapper
public interface LwcpwsDao {

		@Select("select  id,company_name,court,case_no,case_name,case_reason,submit_date,defendant,prosecutor from lwcpws order by id")
		List<Lwcpws> findList();
		
		
		@Insert("INSERT  INTO `kq`  (Name,EnrollNumber,Time,VerifyMode,InOutMode) VALUES (#{Name},#{EnrollNumber},#{Time},#{VerifyMode},#{InOutMode});")
		Integer insertPai(Api api);
		
		@Select("select  id,Name,EnrollNumber,Time,VerifyMode,InOutMode from kq where Time=#{Time}")
		Api findByTime(@Param("Time") Object Time);
		

		
}