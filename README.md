# MyLibtest
#电影电视剧选集列表

##引入：
*settings.gradle加入：

maven {url "https://jitpack.io"}

app的build.gradle加入：

implementation 'com.github.toorup:MyLibtest:v1.0.0'

##布局XML中：
        
        <com.icecool.mylist_xj.MyView
	
        android:id="@+id/mv1"
	
        android:layout_marginTop="30dp"
	
        android:layout_width="match_parent"
	
        android:layout_height="wrap_content"/>
	

        
##使用代码：
```java
com.icecool.mylist_xj.MyView mv;


mv=findViewById(R.id.mv1);
//加载数据
        IntData();
	//刷新数据
	mv.notifyadapter();
	//设置点击监听
	mv.SetOnMyitemClickListener(new MyView.OnMyitemClickListener() {
		@Override
		public void OnMyItemClickListener(RecyclerView parent, View view, int position, List<info_xianji> datas) {
		Toast.makeText(MainActivity.this, "你选了" + datas.get(position).gettxt(), Toast.LENGTH_SHORT).show();
	}
        });


public void IntData(){

        mv.datalist.clear();
	for(int i=1;i<20;i++){
		mv.datalist.add(new info_xianji("第" + i + "集"));
	}
}
```
