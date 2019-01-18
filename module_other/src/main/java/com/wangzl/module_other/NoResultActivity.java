package com.wangzl.module_other;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.wangzl.module_base.RouterMap;
import com.wangzl.module_base.util.ToastUtil;

/**
 * @Author wangzl
 * @Date 2019/1/16 10:15
 * @Description TODO
 */
@Route(path = RouterMap.NO_RESULT_ACTIVITY)
public class NoResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ToastUtil.showMsg("NoResultActivity onCreate");
    }
}
