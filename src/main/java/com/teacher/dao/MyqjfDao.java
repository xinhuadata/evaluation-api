package com.teacher.dao;


import com.teacher.entity.Lwxq;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 功能描述: 考勤的dao
 *
 * @auther: njw
 * @date: 2018/7/30
 */
@Mapper
public interface MyqjfDao {


		//名誉权纠纷
		@Select("select court,updatedate,casereason,fmtcontent from lwxq where casereason='名誉权纠纷'limit 0,1000")
		List<Lwxq> findList4();





		
}