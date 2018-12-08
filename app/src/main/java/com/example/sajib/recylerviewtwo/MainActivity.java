package com.example.sajib.recylerviewtwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
 RecyclerView recyclerViewMain;
 Myrecycleadapter myrecycleadapter;
 List<MydataModel>mydataModels=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewMain=(RecyclerView)findViewById(R.id.recycleid);
        recyclerViewMain.setLayoutManager(new LinearLayoutManager(this));
        myrecycleadapter=new Myrecycleadapter(this,mydataModels);
        recyclerViewMain.setAdapter(myrecycleadapter);
        loaddata();
    }
    public  void loaddata(){
        MydataModel m1=new MydataModel("sajib","https://avatars3.githubusercontent.com/u/11577788?s=400&v=4");
        mydataModels.add(m1);
        MydataModel m2=new MydataModel("sajib","https://avatars3.githubusercontent.com/u/11577788?s=400&v=4");
        mydataModels.add(m2);
        MydataModel m3=new MydataModel("sajib","https://avatars3.githubusercontent.com/u/11577788?s=400&v=4");
        mydataModels.add(m3);
        MydataModel m4=new MydataModel("sajib","https://avatars3.githubusercontent.com/u/11577788?s=400&v=4");
        mydataModels.add(m4);
        MydataModel m5=new MydataModel("sajib","https://avatars3.githubusercontent.com/u/11577788?s=400&v=4");
        mydataModels.add(m5);
        myrecycleadapter.notifyDataSetChanged();
    }
}
