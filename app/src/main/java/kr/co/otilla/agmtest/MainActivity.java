package kr.co.otilla.agmtest;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import kr.co.otilla.agmeditlist.EditRecyclerView;

public class MainActivity extends AppCompatActivity {

    List<String> mList;
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
        String[] names = new String[]{ "홍길동", "홍길동2", "홍길동3", "홍길동5", "홍길동6", "홍길동7", "홍길동8", "홍길동9", "홍길동10" };
        Collections.addAll(mList, names);
        mAdapter = new WriteAdapter(this, mList);
        mAdapter.setEdit(true);
        mRecyclerView.setAdapter(mAdapter);
    }
}
