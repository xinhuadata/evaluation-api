//package com.teacher.service;
//
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * 功能描述:验证方式对应表
// *
// * @auther: njw
// * @date: 2018/4/23
// */
//public class MapUtil {
//
//
//    private static Map<Integer,String> verifyModeMap=new HashMap<Integer,String>();
//    public static Map<Integer,String> getVerifyModeMap(){
//        verifyModeMap.put(0, "默认");//默认  FP_OR_PW_OR_RF
//        verifyModeMap.put(1, "仅指纹");//FP
//        verifyModeMap.put(2, "仅工号");//PIN
//        verifyModeMap.put(3, "仅密码");//PW
//        verifyModeMap.put(4, "仅卡");//RF
//        verifyModeMap.put(5, "指纹或密码");//FP_OR_PW
//        verifyModeMap.put(6, "卡或指纹");//FP_OR_RF
//        verifyModeMap.put(7, "卡或密码");//PW_OR_RF
//        verifyModeMap.put(8, "工号加指纹");//PIN_AND_FP
//        verifyModeMap.put(9, "指纹加密码");//FP_AND_RF
//        verifyModeMap.put(10, "卡加指纹");//FP_AND_RF
//        verifyModeMap.put(11, "卡加密码");//PW_AND_RF
//        verifyModeMap.put(12, "卡加指纹加密码");//FP_AND_PW_AND_RF
//        verifyModeMap.put(13, "工号加指纹加密码");//PIN_AND_FP_AND_PW
//        verifyModeMap.put(14, "指纹加卡或工号");//FP_AND_RF_OR_PIN
//        verifyModeMap.put(15, "仅人脸");//FACE
//        verifyModeMap.put(16, "人脸加指纹");//FACE_AND_FP
//        verifyModeMap.put(17, "人脸加密码");//FACE_AND_PW
//        verifyModeMap.put(18, "人脸加卡");//FACE_AND_RF
//        verifyModeMap.put(19, "人脸加指纹加卡");//FACE_AND_FP_AND_RF
//        verifyModeMap.put(20, "人脸加指纹加密码");//FACE_AND_FP_AND_RF
//        return verifyModeMap;
//
//    }
//
//}
