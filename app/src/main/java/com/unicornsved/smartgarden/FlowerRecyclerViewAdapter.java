package com.unicornsved.smartgarden;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.unicornsved.smartgarden.placeholder.PlaceholderContent;
import com.unicornsved.smartgarden.placeholder.PlaceholderContent.Flower;
import com.unicornsved.smartgarden.databinding.FragmentItemBinding;
import com.unicornsved.smartgarden.ui.FlowerInfoActivity;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link Flower}.
 * TODO: Replace the implementation with code for your data type.
 */
public class FlowerRecyclerViewAdapter extends RecyclerView.Adapter<FlowerRecyclerViewAdapter.ViewHolder> {

    private final List<Flower> mValues;

    public FlowerRecyclerViewAdapter(List<Flower> items) {
        mValues = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new ViewHolder(FragmentItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.mIdView.setText(mValues.get(position).name);
        holder.mContentView.setText(Integer.toString(mValues.get(position).getHumidity())+"%");
        holder.mImageFlower.setImageResource(mValues.get(position).randomImageFlower());
        holder.mImageFlower.setScaleX(1.5F);
        holder.mImageFlower.setScaleY(1.5F);
        holder.mImageHumidity.setImageResource(Flower.IMAGE_HUM);
        holder.mImageFlower.setScaleX(0.4F);
        holder.mImageFlower.setScaleY(0.4F);
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public final TextView mIdView;
        public final TextView mContentView;
        public final ImageView mImageFlower, mImageHumidity;
        public Flower mItem;
        final LinearLayout listDevice;

        public ViewHolder(FragmentItemBinding binding) {
            super(binding.getRoot());
            mIdView = binding.name;
            mContentView = binding.place;
            mImageFlower = binding.imageFlower;
            mImageHumidity = binding.imageHumidity;
            listDevice = binding.linLay;
            listDevice.setOnClickListener(this);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mContentView.getText() + "'";
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            if(position != RecyclerView.NO_POSITION) {
                Intent intent = new Intent(v.getContext(), FlowerInfoActivity.class);
                intent.putExtra(PlaceholderContent.Flower.class.getSimpleName(), position);
                v.getContext().startActivity(intent);
            }
        }
    }
}