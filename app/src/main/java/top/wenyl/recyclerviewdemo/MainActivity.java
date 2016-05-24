package top.wenyl.recyclerviewdemo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import top.wenyl.recyclerviewdemo.masonry.MasonryAdapter;
import top.wenyl.recyclerviewdemo.masonry.Product;
import top.wenyl.recyclerviewdemo.masonry.RecycleItemClickListener;
import top.wenyl.recyclerviewdemo.masonry.SpacesItemDecoration;


public class MainActivity extends Activity {
    private RecyclerView recyclerView;
    private List<Product> productList;
    private MasonryAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView= (RecyclerView) findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL));
        findViewById(R.id.btn_in).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Product p=new Product(R.mipmap.p6,"我是照片");
                productList.add(p);
                adapter.notifyItemInserted(1);
//                adapter.notifyItemChanged(0);
            }
        });
        findViewById(R.id.btn_rm).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                productList.remove(0);
                adapter.notifyItemRemoved(0);
            }
        });


        initData();
        RecycleItemClickListener itemClickListener=new RecycleItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
//                Log.e("position","="+position);
                Toast.makeText(MainActivity.this,"click"+position, Toast.LENGTH_SHORT).show();

            }
        };
        adapter=new MasonryAdapter(productList,itemClickListener);
        recyclerView.setAdapter(adapter);
        SpacesItemDecoration decoration=new SpacesItemDecoration(16);
        recyclerView.addItemDecoration(decoration);

    }

    private void initData() {
        productList=new ArrayList<Product>();
        Product p1=new Product(R.mipmap.p1,"我是照片1");
        productList.add(p1);
        Product p2=new Product(R.mipmap.p2,"我是照片2");
        productList.add(p2);
        Product p3=new Product(R.mipmap.p3,"我是照片3");
        productList.add(p3);
        Product p4=new Product(R.mipmap.p4,"我是照片4");
        productList.add(p4);
        Product p5=new Product(R.mipmap.p5,"我是照片5");
        productList.add(p5);
        Product p6=new Product(R.mipmap.p6,"我是照片6");
        productList.add(p6);
        Product p7=new Product(R.mipmap.p2,"我是照片7");
        productList.add(p7);
        Product p8=new Product(R.mipmap.p1,"我是照片8");
        productList.add(p8);
        Product p9=new Product(R.mipmap.p4,"我是照片9");
        productList.add(p9);
        Product p10=new Product(R.mipmap.p6,"我是照片10");
        productList.add(p10);


        Product p11=new Product(R.mipmap.p3,"我是照片11");
        productList.add(p11);
        Product p12=new Product(R.mipmap.p2,"我是照片12");
        productList.add(p12);
        Product p13=new Product(R.mipmap.p3,"我是照片13");
        productList.add(p13);
        Product p14=new Product(R.mipmap.p4,"我是照片14");
        productList.add(p14);
        Product p15=new Product(R.mipmap.p5,"我是照片15");
        productList.add(p15);
        Product p16=new Product(R.mipmap.p6,"我是照片16");
        productList.add(p16);
        Product p17=new Product(R.mipmap.p2,"我是照片17");
        productList.add(p17);
        Product p18=new Product(R.mipmap.p1,"我是照片18");
        productList.add(p18);
        Product p19=new Product(R.mipmap.p4,"我是照片19");
        productList.add(p19);
        Product p20=new Product(R.mipmap.p6,"我是照片20");
        productList.add(p20);


        Product p21=new Product(R.mipmap.p3,"我是照片11");
        productList.add(p11);
        Product p22=new Product(R.mipmap.p2,"我是照片12");
        productList.add(p22);
        Product p23=new Product(R.mipmap.p3,"我是照片13");
        productList.add(p23);
        Product p24=new Product(R.mipmap.p4,"我是照片14");
        productList.add(p24);
        Product p25=new Product(R.mipmap.p5,"我是照片15");
        productList.add(p25);
        Product p26=new Product(R.mipmap.p6,"我是照片16");
        productList.add(p26);
        Product p27=new Product(R.mipmap.p2,"我是照片17");
        productList.add(p27);
        Product p28=new Product(R.mipmap.p1,"我是照片18");
        productList.add(p28);
        Product p29=new Product(R.mipmap.p4,"我是照片19");
        productList.add(p29);
        Product p30=new Product(R.mipmap.p6,"我是照片20");
        productList.add(p30);





        Product p31=new Product(R.mipmap.p3,"我是照片11");
        productList.add(p31);
        Product p32=new Product(R.mipmap.p2,"我是照片12");
        productList.add(p32);
        Product p33=new Product(R.mipmap.p3,"我是照片13");
        productList.add(p33);
        Product p34=new Product(R.mipmap.p4,"我是照片14");
        productList.add(p34);
        Product p35=new Product(R.mipmap.p5,"我是照片15");
        productList.add(p35);
        Product p36=new Product(R.mipmap.p6,"我是照片16");
        productList.add(p36);
        Product p37=new Product(R.mipmap.p2,"我是照片17");
        productList.add(p37);
        Product p38=new Product(R.mipmap.p1,"我是照片18");
        productList.add(p38);
        Product p39=new Product(R.mipmap.p4,"我是照片19");
        productList.add(p39);
        Product p40=new Product(R.mipmap.p6,"我是照片20");
        productList.add(p40);


        Product p41=new Product(R.mipmap.p3,"我是照片11");
        productList.add(p41);
        Product p42=new Product(R.mipmap.p2,"我是照片12");
        productList.add(p42);
        Product p43=new Product(R.mipmap.p3,"我是照片13");
        productList.add(p43);
        Product p44=new Product(R.mipmap.p4,"我是照片14");
        productList.add(p44);
        Product p45=new Product(R.mipmap.p5,"我是照片15");
        productList.add(p45);
        Product p46=new Product(R.mipmap.p6,"我是照片16");
        productList.add(p46);
        Product p47=new Product(R.mipmap.p2,"我是照片17");
        productList.add(p47);
        Product p48=new Product(R.mipmap.p1,"我是照片18");
        productList.add(p48);
        Product p49=new Product(R.mipmap.p4,"我是照片19");
        productList.add(p49);
        Product p50=new Product(R.mipmap.p6,"我是照片20");
        productList.add(p50);







    }

}
