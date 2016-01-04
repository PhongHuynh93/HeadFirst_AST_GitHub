package com.phong.headfirst.GitHub0;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * Created by huynhducthanhphong on 1/3/16.
 */
public class ImageWebService extends AsyncTask<String, Integer, Bitmap>{
    private final ProgressDialog progressDialog;
    private final ImageView imageView;

    public ImageWebService(Context context, ImageView imageView) {
        progressDialog = ProgressDialog.show(context, "Wait", "Contacting the server...");
        progressDialog.setCancelable(false);
        this.imageView = imageView;
    }


    @Override
    protected Bitmap doInBackground(String... params) {
        String url = params[0];
        Bitmap bitmap = null;

        InputStream inputStream = null;
        try {
            inputStream = new URL(url).openStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        bitmap = BitmapFactory.decodeStream(inputStream);

        return bitmap;
    }

    @Override
    protected void onPostExecute(Bitmap bitmap) {
        super.onPostExecute(bitmap);
        progressDialog.dismiss();
        imageView.setImageBitmap(bitmap);
    }
}
