package com.example.a1092recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    int Images[] = {R.drawable.amazonlogo, R.drawable.applelogo,
            R.drawable.ioslogo, R.drawable.javalogo,
            R.drawable.javalogo, R.drawable.javalogo,
            R.drawable.javalogo, R.drawable.javalogo
    };
    String[] Logo = {"AmazonLogo", "AppleLogo",
            "IosLogo", "JavaLogo",
            "JavaLogo", "JavaLogo",
            "JavaLogo", "JavaLogo"
    };
    String[] LogoDescription = {"Amazonnn", "Appleee",
            "Iossss", "Javaaaa",
            "Javaaaa", "Javaaaa",
            "Javaaaa", "Javaaaa"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.RecycleViewId);

        // new MyAdapter 物件，傳入參數
        MyAdapter myAdapter = new MyAdapter(this, Logo, LogoDescription, Images);
        // 使用 myAdapter 物件
        recyclerView.setAdapter(myAdapter);
        // 設定 RecyclerView 每個 Item 之間的分隔線
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        // 一定要設定佈局，否則不會顯示內容
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}