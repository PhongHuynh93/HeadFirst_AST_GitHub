package com.phong.headfirst.GitHub1;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.phong.headfirst.R;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.jar.Manifest;

public class Camera_intent extends AppCompatActivity {

    private static final int ACTIVITY_START_CAMERA_APP = 0;
    private static final int REQUEST_EXTERNAL_STORAGE_RESULT = 1;
    private ImageView mPhotoCaptureImageView;
    private String mImageFileFileLocation = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.github_camera_intent);

        mPhotoCaptureImageView = (ImageView) findViewById(R.id.capturePhotoImageView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_camera_intent, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /*
    Thêm code cho android 6.0
     */
    public void takePhoto(View view) {
        if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
            callCameraApp();
        }
        else {
            if (shouldShowRequestPermissionRationale(android.Manifest.permission.WRITE_EXTERNAL_STORAGE)) {
                Toast.makeText(Camera_intent.this, "External storage permission required to save images", Toast.LENGTH_SHORT).show();
            }
            requestPermissions(new String[] {android.Manifest.permission.WRITE_EXTERNAL_STORAGE}, REQUEST_EXTERNAL_STORAGE_RESULT);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        if (requestCode == REQUEST_EXTERNAL_STORAGE_RESULT) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                callCameraApp();
            } else {
                Toast.makeText(this, "External permission has not been granted, cant save images", Toast.LENGTH_SHORT).show();
            }
        } else {
            super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }

    public void callCameraApp() {
        // gọi camera
        Intent callCameraApplicationIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

        // đặt tên file
        File photoFile = null;
        try {
            photoFile = CreateImageFile();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // truyền tên ảnh cho activity kia
        callCameraApplicationIntent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(photoFile));
        // chụp ảnh và có return
        startActivityForResult(callCameraApplicationIntent, ACTIVITY_START_CAMERA_APP);
    }

    /*
    Chỉ nơi lưu tấm ảnh
     */
    private File CreateImageFile() throws IOException {
        // tên theo ngày giờ chụp ảnh
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String imageFileName = "IMAGE_" + timeStamp + "_";

        // chỉ nới lưu tấm ảnh
        File storageDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES); // biến chỉ nới lưu pictures

        // tên ành
        File image = File.createTempFile(imageFileName, ".jpg", storageDirectory);

        // lây địa chỉ hoàn chỉnh nới lưu ảnh
        mImageFileFileLocation = image.getAbsolutePath();
        return image;
    }

    /*
    Khi chụp ảnh xong rồi
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == ACTIVITY_START_CAMERA_APP && resultCode == RESULT_OK) {
//            Bitmap photoCapturedBitmap = BitmapFactory.decodeFile(mImageFileFileLocation); // lấy ảnh từ thư mục
//            mPhotoCaptureImageView.setImageBitmap(photoCapturedBitmap); // lưu lên imageview
            rotateImage(setReducedImageSize());
        }
    }

    /*
    Scale ảnh dựa vào camera
     */
    private Bitmap setReducedImageSize() {
        int targetImageViewWidth = mPhotoCaptureImageView.getWidth();
        int targetImageViewHeight = mPhotoCaptureImageView.getHeight();

        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(mImageFileFileLocation, options);

        int cameraImageWidth = options.outWidth;
        int cameraImageHeight = options.outHeight;

        int scaleFactor = Math.min(cameraImageWidth / targetImageViewWidth, cameraImageHeight / targetImageViewHeight);
        options.inSampleSize = scaleFactor;
        options.inJustDecodeBounds = false;

//        Bitmap photoReducedSizeBitmap = BitmapFactory.decodeFile(mImageFileFileLocation, options);
//        mPhotoCaptureImageView.setImageBitmap(photoReducedSizeBitmap);
        return BitmapFactory.decodeFile(mImageFileFileLocation, options);

    }

    /*
    Xoay ảnh nhờ Bitmap
     */
    private void rotateImage(Bitmap bitmap) {
        ExifInterface exifInterface = null;
        try {
            exifInterface = new ExifInterface(mImageFileFileLocation);
        } catch (IOException e) {
            e.printStackTrace();
        }

        int orientation = exifInterface.getAttributeInt(ExifInterface.TAG_ORIENTATION, ExifInterface.ORIENTATION_UNDEFINED);
        Matrix matrix = new Matrix();
        switch (orientation) {
            case ExifInterface.ORIENTATION_ROTATE_90:
                matrix.setRotate(90);
                break;
            case ExifInterface.ORIENTATION_ROTATE_180:
                matrix.setRotate(180);
                break;
            default:
        }
        Bitmap rotatedBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        mPhotoCaptureImageView.setImageBitmap(rotatedBitmap);
    }
}
