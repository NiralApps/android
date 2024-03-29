package com.example.farmerapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ProductViewHolder> {
    //this context we will use to inflate the layout
    private Context mCtx;
    private Boolean isCategory;
    //we are storing all the products in a list
    private List<CategoriesList> productList;
    //getting the context and product list with constructor
    public CategoryAdapter(Context mCtx, List<CategoriesList> productList, Boolean isCategory) {
        this.mCtx = mCtx;
        this.productList = productList;
        this.isCategory = isCategory;
    }
    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating and returning our view holder
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.category_list_item, null);
        return new ProductViewHolder(view);
    }
    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        //getting the product of the specified position
        CategoriesList product = productList.get(position);
        //binding the data with the viewholder views
        holder.categoryName.setText(product.getTitle());
        holder.categoryLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isCategory){
                    Intent i = new Intent(mCtx, CategoryListViewActivity.class);
                    mCtx.startActivity(i);
                } else {

                }
            }
        });
    }
    @Override
    public int getItemCount() {
        return productList.size();
    }
    class ProductViewHolder extends RecyclerView.ViewHolder {
        TextView categoryName;
        ConstraintLayout categoryLayout;
        public ProductViewHolder(View itemView) {
            super(itemView);
            categoryName = itemView.findViewById(R.id.categoryName);
            categoryLayout = itemView.findViewById(R.id.categoryLayout);
        }
    }
}
