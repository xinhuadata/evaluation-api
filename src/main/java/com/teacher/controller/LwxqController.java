package com.teacher.controller;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.teacher.dao.LwcpwsDao;
import com.teacher.dao.LwxqDao;
import com.teacher.entity.Lwcpws;
import com.teacher.entity.Lwxq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 功能描述: 法律裁判文书
 *
 * @auther: njw
 * @date: 2018/7/30
 */

@RestController
@RequestMapping("/xhs")
public class LwxqController {

	@Autowired
	private LwxqDao lwxqDao;
	
	//查询全部数据
	@GetMapping(value = "/lwxq/{page}/{pagesize}")
	public List<Lwxq> toUserList(@PathVariable("page") Integer page, @PathVariable("pagesize") Integer pagesize,
								 Map<String, Object> map){
		//分页并查询
        Page<Lwxq> pageInfo = PageHelper.startPage(page, pagesize);
        List<Lwxq> users = lwxqDao.findList();
        //获取分页信息演示, 实际项目中一般会封装为自己的返回体。
        int pageNum = pageInfo.getPageNum();
        int pageSize = pageInfo.getPageSize();
        long total = pageInfo.getPages();
        List<Lwxq> result = pageInfo.getResult();//和上面的users结果相同
		return result;
	}




	
	
	
    
}