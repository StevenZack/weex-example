package com.weex.sample;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.squareup.picasso.Picasso;
import com.taobao.weex.adapter.IWXImgLoaderAdapter;
import com.taobao.weex.common.WXImageStrategy;
import com.taobao.weex.dom.WXImageQuality;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class ImageAdapter implements IWXImgLoaderAdapter {
    @Override
    public void setImage(final String url, final ImageView view, WXImageQuality quality, WXImageStrategy strategy) {
        Picasso.with(view.getContext()).load(url).placeholder(R.mipmap.ic_launcher).into(view);
    }
}
