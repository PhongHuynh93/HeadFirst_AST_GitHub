package com.phong.headfirst.HF11;

import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.phong.headfirst.R;

public class DrinkActivity extends Activity {

    public static final String EXTRA_DRINKNO = "drinkNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_hf11);

        //Get the drink from the intent
        int drinkNo = (Integer) getIntent().getExtras().get(EXTRA_DRINKNO);
//        Drink drink = Drink.drinks[drinkNo];
        // create + access to databse + retrieve from it
        try {
            SQLiteOpenHelper starbuzzDatabaseHelper = new StarbuzzDatabaseHelper(this);
            SQLiteDatabase db = starbuzzDatabaseHelper.getReadableDatabase();
            Cursor cursor = db.query("DRINK",
                    new String[]{"NAME", "DESCRIPTION", "IMAGE_RESOURCE_ID"},
                    "_id = ?",
                    new String[]{Integer.toString(drinkNo)},
                    null, null, null);
            //Code to do something with the cursor
            //Move to the first record in the Cursor
            if (cursor.moveToFirst()) {
                //Get the drink details from the cursor
                String nameText = cursor.getString(0);
                String descriptionText = cursor.getString(1);
                int photoId = cursor.getInt(2);
                boolean isFavorite = (cursor.getInt(3) == 1);

                //Populate the drink name
                TextView name = (TextView) findViewById(R.id.name);
                name.setText(nameText);

                //Populate the drink description
                TextView description = (TextView) findViewById(R.id.description);
                description.setText(descriptionText);

                //Populate the drink image
                ImageView photo = (ImageView) findViewById(R.id.photo);
                photo.setImageResource(photoId);
                photo.setContentDescription(nameText);

                // Populate the favorite check box
                CheckBox checkBox = (CheckBox) findViewById(R.id.favorite);
                checkBox.setChecked(isFavorite);
            }
            cursor.close();
            db.close();
        } catch (SQLiteException e) {
            Toast toast = Toast.makeText(this, "Database unavailable", Toast.LENGTH_SHORT);
            toast.show();
        }

        //Populate the drink image
//        ImageView photo = (ImageView) findViewById(R.id.photo);
//        photo.setImageResource(drink.getImageResourceId());
//        photo.setContentDescription(drink.getName());
//
//        //Populate the drink name
//        TextView name = (TextView) findViewById(R.id.name);
//        name.setText(drink.getName());
//
//        //Populate the drink description
//        TextView description = (TextView) findViewById(R.id.description);
//        description.setText(drink.getDescription());
    }

    // when clicked, update the database
    public void onFavoriteClicked(View view) {
        int drinkNo = (Integer) getIntent().getExtras().get("drinkNo");
        CheckBox favorite = (CheckBox) findViewById(R.id.favorite);
        ContentValues drinkValues = new ContentValues();
        drinkValues.put("FAVORITE", favorite.isChecked());
        SQLiteOpenHelper starbuzzDatabaseHelper =
                new StarbuzzDatabaseHelper(DrinkActivity.this);
        try {
            SQLiteDatabase db = starbuzzDatabaseHelper.getWritableDatabase();
            db.update("DRINK", drinkValues,
                    "_id = ?", new String[]{Integer.toString(drinkNo)});
            db.close();
        } catch (SQLiteException e) {
            Toast toast = Toast.makeText(this, "Database unavailable", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
