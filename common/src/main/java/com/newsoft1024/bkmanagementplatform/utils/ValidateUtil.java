package com.newsoft1024.bkmanagementplatform.utils;

import java.util.Collection;
import java.util.Map;

/**
 * Author: Doctor
 * Description:
 * Date: 2019-2-11 15:29
 * Modify By:
 */
public class ValidateUtil {

    public static boolean isNullpointerAndNullSize(Object obj){
        boolean flag = true;
        if(obj == null){
            return flag;
        }else if(obj instanceof String){
            String str = (String)obj;
            flag = str.trim().isEmpty();
        }else if(obj instanceof Collection){
            Collection col = (Collection)obj;
            flag = col.isEmpty();
        }else if(obj instanceof Map){
            Map map = (Map)obj;
            flag = map.isEmpty();
        }

        return false;

    }

    public static boolean isNotNullpointerAndNullSize(Object obj){

        return !(isNullpointerAndNullSize(obj));

    }

    public static boolean isNullpointerAndNullSize(Object... obj){
        for (Object tem: obj){
            if(isNullpointerAndNullSize(tem)){
                return true;
            }
        }
        return false;
    }



    public static void validateAndThrowMessage(Object obj,String mes){
        if(isNullpointerAndNullSize(obj)){
            throw new RuntimeException(mes);
        }
    }
}
