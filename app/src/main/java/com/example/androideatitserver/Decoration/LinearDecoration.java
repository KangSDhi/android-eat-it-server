package com.example.androideatitserver.Decoration;

import android.graphics.Rect;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LinearDecoration extends RecyclerView.ItemDecoration {

    private int padding;

    public LinearDecoration(int padding) {
        this.padding = padding;
    }

    @Override
    public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        outRect.top = padding;
        outRect.left = padding;
        outRect.right = padding;
    }
}
