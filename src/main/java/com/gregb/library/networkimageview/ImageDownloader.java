package com.gregb.library.networkimageview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by gui on 07/08/2014.
 */
public class ImageDownloader {
  private static final String TAG = "ImageDownloader";

  @Deprecated
  public static void init(Context context) {
/*        DisplayImageOptions options = new DisplayImageOptions.Builder()
                .showImageOnLoading(R.drawable.riv_blank).imageScaleType(ImageScaleType.IN_SAMPLE_INT)
                .displayer(new FadeInBitmapDisplayer(250)).bitmapConfig(Bitmap.Config.RGB_565)
                .cacheInMemory(true).cacheOnDisc(true).considerExifParams(true)
                .delayBeforeLoading(100).build();
        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(context)
                .defaultDisplayImageOptions(options).denyCacheImageMultipleSizesInMemory()
                .threadPriority(Thread.NORM_PRIORITY + 3).memoryCache(new WeakMemoryCache()).memoryCacheExtraOptions(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT)
                .discCacheFileCount(500).build();

        if (!ImageLoader.getInstance().isInited()) {
            ImageLoader.getInstance().init(config);
        }*/
  }

  @Deprecated
  public static void init(Context context, Drawable drawable) {
/*        DisplayImageOptions options = new DisplayImageOptions.Builder()
                .showImageOnLoading(drawable).imageScaleType(ImageScaleType.IN_SAMPLE_INT)
                .displayer(new FadeInBitmapDisplayer(250)).bitmapConfig(Bitmap.Config.RGB_565)
                .cacheInMemory(true).cacheOnDisc(true).delayBeforeLoading(100).build();
        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(context)
                .defaultDisplayImageOptions(options).denyCacheImageMultipleSizesInMemory()
                .threadPriority(Thread.NORM_PRIORITY + 3).memoryCache(new WeakMemoryCache())
                .discCacheFileCount(500).build();

        if (!ImageLoader.getInstance().isInited()) {
            ImageLoader.getInstance().init(config);
        }*/
  }

  public static void loadImage(final Context context, final String url, final ImageView imageView) {
    Picasso.with(context)
        .load(url)
        .fit()

        //    .diskCacheStrategy(DiskCacheStrategy.RESULT)
        //    .crossFade()
        .into(imageView);
  }

  public static void loadImage(final Context context, final String url, final ImageView imageView,
                               final int downloadIndicator) {
    Picasso.with(context)
        .load(url)
        .fit()
        .centerCrop()
        //    .diskCacheStrategy(DiskCacheStrategy.RESULT)
        .placeholder(downloadIndicator)
        //    .crossFade()
        .into(imageView);
  }


}
