package com.johnson.pablo.sharebook.util.media.transformations.glide;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;

import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;
import com.johnson.pablo.sharebook.R;
import com.johnson.pablo.sharebook.util.media.transformations.ShareBookTransformationUtils;


/**
 * @author Pablo Johnson (pablo.88j@gmail.com)
 */
public class BorderedCircleGlideTransformation extends BitmapTransformation {

    protected final int strokeWidth;

    public BorderedCircleGlideTransformation(Context context) {
        super(context);
        Resources resources = context.getResources();
        strokeWidth = resources.getDimensionPixelSize(R.dimen.default_picture_stroke_width);
    }

    @Override
    protected Bitmap transform(BitmapPool pool, Bitmap toTransform, int outWidth, int outHeight) {
        return ShareBookTransformationUtils.borderedCircle(pool, toTransform, strokeWidth);
    }

    @Override
    public String getId() {
        return getClass().getName();
    }

}