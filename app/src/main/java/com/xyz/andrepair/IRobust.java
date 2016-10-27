package com.xyz.andrepair;

import android.content.Context;

/**
 * Created by zhangzheng on 2016/10/21.
 */

public interface IRobust {
    public boolean isBug(Object _this, Context context, String className, String methodName, Object[] params);

    public Object invoice(Object _this, Context context, String className, String methodName, Object[] params);
}
