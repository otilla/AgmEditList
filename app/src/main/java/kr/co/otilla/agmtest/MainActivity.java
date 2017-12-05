package kr.co.otilla.agmtest;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import kr.co.otilla.agmeditlist.ContentData;
import kr.co.otilla.agmeditlist.EditRecyclerView;

public class MainActivity extends AppCompatActivity {

    ArrayList<ContentData> mList;
    WriteAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mList = new ArrayList<>();

        EditRecyclerView mRecyclerView = (EditRecyclerView)findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));

        BitmapDrawable drawable = (BitmapDrawable) getResources().getDrawable(R.drawable.logo_image);
        Bitmap bitmap = drawable.getBitmap();

        mList.add(new ContentData(bitmap, "파일명", "", ""));
        mList.add(new ContentData(bitmap, "파일명2", "", ""));
        mList.add(new ContentData(bitmap, "파일명3", "", ""));
        mList.add(new ContentData(bitmap, "파일명4", "", ""));
        mList.add(new ContentData(bitmap, "파일명5", "", ""));
        mList.add(new ContentData(bitmap, "파일명6", "", ""));

        mAdapter = new WriteAdapter(this, mList);
        mAdapter.setEdit(true);
        mRecyclerView.setAdapter(mAdapter);
    }
}
