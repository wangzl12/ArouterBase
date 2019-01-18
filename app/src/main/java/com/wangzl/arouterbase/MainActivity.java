package com.wangzl.arouterbase;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.bt_no_result)
    Button btNoResult;
    @BindView(R.id.bt_has_result)
    Button btHasResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.bt_no_result, R.id.bt_has_result})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.bt_no_result:
                break;
            case R.id.bt_has_result:
                break;
        }
    }
}
