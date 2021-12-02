package com.example.chelsea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import com.bumptech.glide.Glide;

public class ImageViewActivity extends AppCompatActivity {

    private ImageView mImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);

        // 记得申请网络请求权限
        mImageView = findViewById(R.id.mImageView11111);
        Glide.with(this)
                .load("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fawb.img.xmtbang.com%2Fimg%2Fuploadnew%2F201507%2F13%2Fe4fd10364d824a278306af6f311d48dc.jpg&refer=http%3A%2F%2Fawb.img.xmtbang.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1641008165&t=eca7676d6f6a0134e45f17b2287cef8c")
                .into(mImageView);
    }
}