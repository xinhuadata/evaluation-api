//package com.teacher.service;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.List;
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Service;
//
//import com.teacher.dao.ApiDao;
//import com.teacher.entity.Api;
//
///**
// * 功能描述: 考勤的定时任务
// * 每一分钟执行一次,把最新数据存入数据库中
// *
// * @auther: njw
// * @date: 2018/7/30
// */
//
//
//@Service
//public class QuartzService {
//
//    @Autowired
//    private ApiDao apiDao;
//
//    // 每1分钟启动
//    @Scheduled(cron = "0 0/1 * * * ?")
//    public void timerToNow() {
//        System.out.println("now time:" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
//        ZkemSDK sdk = new ZkemSDK();
//        boolean connFlag = sdk.connect("10.8.8.46", 4370);
//        System.out.println("conn:" + connFlag);
//        //获取用户信息
//        List<Map<String, Object>> generalLogData = sdk.getGeneralLogData();
//
//        Object number = null;
//        Object time = null;
//        Object inOutMode = null;
//        Object verifyMode = null;
//        Object name = null;
//        //遍历集合
//        for (Map<String, Object> map : generalLogData) {
//            //遍历map集合
//            number = map.get("EnrollNumber");
//            time = map.get("Time");
//            inOutMode = map.get("InOutMode");
//            verifyMode = map.get("VerifyMode");
//            //判断编号是否小于200(200以内为本公司员工)
//            if (Integer.parseInt((String) number) < 200) {
//                //通过编号查询姓名
//                Map<String, Object> userInfoByNumber = sdk.getUserInfoByNumber(number.toString());
//                name = userInfoByNumber.get("Name");
//                Api apidb = apiDao.findByTime(time);
//                //如果数据库不存在此条数据就插入
//                if (apidb == null) {
//                    //封装api对象
//                    Api api = new Api();
//                    api.setEnrollNumber(number);
//                    api.setTime(time);
//                    api.setInOutMode(inOutMode);
//                    api.setVerifyMode(verifyMode);
//                    api.setName(name);
//
//                    //插入数据库
//                    apiDao.insertPai(api);
//                }
//            }
//        }
//    }
//
//}
