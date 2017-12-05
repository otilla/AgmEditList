package kr.co.otilla.agmtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import kr.co.otilla.agmeditlist.EditAdapter;
import kr.co.otilla.agmeditlist.EditLayout;
import kr.co.otilla.agmeditlist.EditViewHolder;

public class WriteAdapter extends EditAdapter<String> {

    public WriteAdapter(Context context, List<String> list) {
        super(context, list);
    }

    @Override
    public EditViewHolder onCreateEditViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_write, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindEditViewHolder(EditViewHolder holder, int position) {
        TextView tvName = (TextView) holder.vContent;
        tvName.setText(mList.get(position));
    }

    private static class ViewHolder extends EditViewHolder {

        ViewHolder(View itemView) {
            super(itemView);
        }

        @Override
        public EditLayout setEditLayout(View itemView) {
            return (EditLayout)itemView.findViewById(R.id.edit_layout);
        }

        @Override
        public View setContent(View itemView) {
            return itemView.findViewById(R.id.tv_name);
        }

        @Override
        public View setPreDelete(View itemView) {
            return itemView.findViewById(R.id.fl_pre_delete);
        }

        @Override
        public View setDelete(View itemView) {
            return itemView.findViewById(R.id.fl_delete);
        }

        @Override
        public View setSort(View itemView) {
            return itemView.findViewById(R.id.fl_sort);
        }
    }
}
