package com.xyz.andrepair;

/**
 * Created by zhangzheng on 2016/10/21.
 */

public class RobustManager {

    private static IRobust iRobust;

    public static void setiRobust(IRobust iRobust) {
        RobustManager.iRobust = iRobust;
    }

    public static boolean isBug(Object _this,String className, String methodName, Object[] param){
        if(iRobust==null){
            return false;
        }
        return iRobust.isBug(_this,AndRepair.context,className,methodName,null);
    }

    public static Object invoice(Object _this,String className,String methodName,  Object[] param){
        if(iRobust==null){
            return null;
        }
        return iRobust.invoice(_this,AndRepair.context,className,methodName,null);
    }
}
