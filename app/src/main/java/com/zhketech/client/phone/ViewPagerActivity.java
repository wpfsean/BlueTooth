package com.zhketech.client.phone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.zhketech.client.phone.utils.ButtomSlidingAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ViewPagerActivity extends AppCompatActivity {

    @BindView(R.id.m_recyclearview)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        ButterKnife.bind(this);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(ViewPagerActivity.this, 1);
        gridLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(gridLayoutManager);
        int images[] = new int[]{R.mipmap.port_network_intercom_btn_selected, R.mipmap.port_network_intercom_btn_selected, R.mipmap.port_network_intercom_btn_selected,R.mipmap.port_network_intercom_btn_selected, R.mipmap.port_network_intercom_btn_selected,R.mipmap.port_network_intercom_btn_selected};
        ButtomSlidingAdapter ada = new ButtomSlidingAdapter(ViewPagerActivity.this, images, 1);
        recyclerView.setAdapter(ada);
        ada.setOnItemClickListener(new ButtomSlidingAdapter.OnItemClickListener() {
            @Override
            public void onClick(int position) {
                Log.i("TAG",position+"iiiiiiiiiiiiii");
            }
        });
    }
}
