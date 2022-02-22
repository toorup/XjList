package com.icecool.mylibtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.icecool.mylist_xj.MyView;
import com.icecool.mylist_xj.info_xianji;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    com.icecool.mylist_xj.MyView mv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mv=findViewById(R.id.mv1);

        //加载数据
        IntData();
        //刷新数据
        mv.notifyadapter();
        //设置点击监听
        mv.SetOnMyitemClickListener(new MyView.OnMyitemClickListener() {
            @Override
            public void OnMyItemClickListener(RecyclerView parent, View view, int position, List<info_xianji> datas) {

                Toast.makeText(MainActivity.this, "你选了" + datas.get(position).gettxt() + ":"+ datas.get(position).getPlayUrl(), Toast.LENGTH_SHORT).show();

                Toast.makeText(MainActivity.this, "你选了" + datas.get(position).gettxt(), Toast.LENGTH_SHORT).show();

            }
        });
    }

    public void IntData(){
        mv.datalist.clear();
        for(int i=1;i<20;i++){

            mv.addData("第"+ i + "集","http://www.cnmv.vip/" + i);

            mv.datalist.add(new info_xianji("第" + i + "集"));

        }
    }


}