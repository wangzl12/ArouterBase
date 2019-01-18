package com.wangzl.module_home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @Author wangzl
 * @Date 2019/1/15 17:04
 * @Description TODO
 */
public class HomeActivity extends AppCompatActivity {

    @BindView(R2.id.bt_no_result)
    Button btNoResult;
    @BindView(R2.id.bt_has_result)
    Button btHasResult;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
    }

    @OnClick({R2.id.bt_no_result, R2.id.bt_has_result})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R2.id.bt_no_result:
                break;
            case R2.id.bt_has_result:
                break;
        }
    }
}
