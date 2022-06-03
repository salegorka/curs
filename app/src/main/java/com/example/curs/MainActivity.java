package com.example.curs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.curs.adapter.ProductAdapter;
import com.example.curs.model.ProductCategory;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ProductAdapter productAdapter;
    RecyclerView productCatRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<ProductCategory> productCategoryList = new ArrayList<>();
        productCategoryList.add(new ProductCategory(1, "Popular"));
        productCategoryList.add(new ProductCategory(2, "All Body Products"));
        productCategoryList.add(new ProductCategory(3, "Skin Care"));
        productCategoryList.add(new ProductCategory(4, "Hair"));

        setProductRecycler(productCategoryList);
    }

    private void setProductRecycler(List<ProductCategory> productCategoryList) {
        productCatRecycler = findViewById(R.id.cat_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager( this, RecyclerView.HORIZONTAL, false);
        productCatRecycler.setLayoutManager(layoutManager);
        productAdapter = new ProductAdapter(this, productCategoryList);
        productCatRecycler.setAdapter(productAdapter);
    }
}