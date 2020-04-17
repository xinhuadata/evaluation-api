package com.teacher.dao;


import com.teacher.entity.Api;
import com.teacher.entity.Lwcpws;
import com.teacher.entity.Lwxq;
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
public interface LwxqDao {

        //查询全部数据
		@Select("select  caseid,casename,caseno,court,createdate,submitdate,updatedate,judgedate,casereason,trialround,defendantlist,prosecutorlist,fmtcontent from lwxq order by caseid")
		List<Lwxq> findList();

		//名誉权、荣誉权纠纷
		@Select("select court,updatedate,casereason,fmtcontent from lwxq where casereason='名誉权、荣誉权纠纷'")
		List<Lwxq> findList1();

		//名誉权、隐私权纠纷
		@Select("select court,updatedate,casereason,fmtcontent from lwxq where casereason='名誉权、隐私权纠纷'")
		List<Lwxq> findList2();


		//名誉权财产损害赔偿纠纷
		@Select("select court,updatedate,casereason,fmtcontent from lwxq where casereason='名誉权财产损害赔偿纠纷'")
		List<Lwxq> findList3();

		//名誉权纠纷
		@Select("select court,updatedate,casereason,fmtcontent from lwxq where casereason='名誉权纠纷'")
		List<Lwxq> findList4();


		//名誉权纠纷肖像权纠纷
		@Select("select court,updatedate,casereason,fmtcontent from lwxq where casereason='名誉权纠纷肖像权纠纷'")
		List<Lwxq> findList5();

		//荣誉权纠纷
		@Select("select court,updatedate,casereason,fmtcontent from lwxq where casereason='荣誉权纠纷'")
		List<Lwxq> findList6();

		//不当得利纠纷
		@Select("select court,updatedate,casereason,fmtcontent from lwxq where casereason='不当得利纠纷'")
		List<Lwxq> findList7();

		//不当竞争纠纷
		@Select("select court,updatedate,casereason,fmtcontent from lwxq where casereason='不当竞争纠纷'")
		List<Lwxq> findList8();



		
}