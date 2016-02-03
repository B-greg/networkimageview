package com.gregb.library.networkimageview;

import android.content.Context;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

public class ImageHelper {

    public interface ImageDownloaderListener {
        public void onDone(boolean success, int result, Object response);
    }

    public static final int IMAGE_DOWNLOAD_SUCCESS = 1;
    public static final int IMAGE_DOWNLOAD_FAIL = 2;
    public static final int IMAGE_DOWNLOAD_CANCEL = 3;

    @Deprecated
    public static void init(Context context) {
    }

    public static void loadImage(Context context, final String url, final ImageView imageView) {
      Picasso.with(context)
                .load(url)
                .centerCrop()
               // .diskCacheStrategy(DiskCacheStrategy.RESULT)
              //  .crossFade()
                .into(imageView);
    }

    @Deprecated
    public static void loadImage(Context context, final String url, final ImageView imageView,
                                 final ImageDownloaderListener listener) {
      Picasso.with(context)
                .load(url)
                .centerCrop()
              //  .diskCacheStrategy(DiskCacheStrategy.RESULT)
              //  .crossFade()
                .into(imageView);
    }


}
