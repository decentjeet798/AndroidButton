<img src="https://avatars0.githubusercontent.com/u/16250929?s=400&u=4b9dbb7de27004b7f1eca9a51501b947ea6c023f&v=4" align="right"/>
Different way of handling button click events.
 ```
  * Using OnCLick attribute on XML Layout
  * Using OnCLickListener Interface
```

## Getting Started

Clone this project  and running on your local machine for development and testing purposes.

* ButtonActivity.java

```
package com.brainyleaf.androidbutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity implements View.OnClickListener {
    // declaring Button view
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        // initialising button view  using findViewById Method.
        button = findViewById(R.id.usingId);
        // Using OnClickListener
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Implement your logic here which you want to perform on button click.
                Toast.makeText(getApplicationContext(), "Button OnClickListener is Clicked", Toast.LENGTH_LONG).show();
            }
        });

        // for btn1 , btn2, btn3 and btn4 using Implementation View.OnClickListener
        Button one = (Button) findViewById(R.id.btn1);
        one.setOnClickListener(this); // calling onClick() method
        Button two = (Button) findViewById(R.id.btn2);
        two.setOnClickListener(this);
        Button three = (Button) findViewById(R.id.btn3);
        three.setOnClickListener(this);
        Button four = (Button) findViewById(R.id.btn4);
        four.setOnClickListener(this);

    }

    /**
     * Called when the user touches the button
     */
    public void myMethod(View view) {
        // Implement your logic here which you want to perform on button click.
        Toast.makeText(getApplicationContext(), "Button is Clicked", Toast.LENGTH_LONG).show();
    }

    // Using Implementation override Method.
    @Override
    public void onClick(View view) {
        // default method for handling onClick Events..
        Button b = (Button) view;
        String buttonText = b.getText().toString();
        switch (view.getId()) {

            case R.id.btn1:
                // do your code
                Toast.makeText(getApplicationContext(), "Button " + buttonText + " is Clicked", Toast.LENGTH_LONG).show();
                break;

            case R.id.btn2:
                // do your code
                Toast.makeText(getApplicationContext(), "Button " + buttonText + " is Clicked", Toast.LENGTH_LONG).show();
                break;

            case R.id.btn3:
                // do your code
                Toast.makeText(getApplicationContext(), "Button " + buttonText + " is Clicked", Toast.LENGTH_LONG).show();
                break;
            case R.id.btn4:
                // do your code
                Toast.makeText(getApplicationContext(), "Button " + buttonText + " is Clicked", Toast.LENGTH_LONG).show();
                break;
            default:
                break;
        }

    }
}

```

*  activity_button.xml

```
<?xml version="1.0" encoding="utf-8"?>
<ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context=".ButtonActivity">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_gravity="center"
        android:orientation="vertical">

        <TextView
            android:layout_width="match_parent"
            android:layout_height="@dimen/_230sdp"
            android:layout_margin="@dimen/_5sdp"
            android:gravity="center"
            android:text="Working of buttons"
            android:textColor="@color/darkRed"
            android:textSize="@dimen/_24sdp" />

        <View
            android:layout_width="match_parent"
            android:layout_height="@dimen/_2sdp"
            android:background="@color/lightRed" />

        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_margin="@dimen/_4sdp"
            android:padding="@dimen/_5sdp"
            android:text="@string/btn_desc"
            android:textSize="@dimen/_12sdp"
            android:textStyle="bold|italic" />

        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:gravity="center"
            android:padding="@dimen/_5sdp"
            android:text="Working of multiple buttons click listner"
            android:textColor="@color/darkRed" />

        <Button
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_margin="@dimen/_2sdp"
            android:background="@color/lightRed"
            android:onClick="myMethod"
            android:text="Onclick in xml layout"
            android:textAllCaps="false"
            android:textColor="@color/colorPrimary" />

        <Button
            android:id="@+id/usingId"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_margin="@dimen/_2sdp"
            android:background="@color/lightRed"
            android:text="Using an OnClickListener"
            android:textAllCaps="false"
            android:textColor="@color/colorPrimary" />

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_margin="@dimen/_2sdp"
            android:gravity="center"
            android:weightSum="5">

            <Button
                android:id="@+id/btn1"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_margin="@dimen/_2sdp"
                android:layout_weight="1"
                android:background="@color/lightRed"
                android:text="Btn1"
                android:textAllCaps="false"
                android:textColor="@color/colorPrimary" />

            <Button
                android:id="@+id/btn2"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_margin="@dimen/_2sdp"
                android:layout_weight="1"
                android:background="@color/lightRed"
                android:text="Btn2"
                android:textAllCaps="false"
                android:textColor="@color/colorPrimary" />

            <Button
                android:id="@+id/btn3"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_margin="@dimen/_2sdp"
                android:layout_weight="1"
                android:background="@color/lightRed"
                android:text="Btn3"
                android:textAllCaps="false"
                android:textColor="@color/colorPrimary" />

            <Button
                android:id="@+id/btn4"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_margin="@dimen/_2sdp"
                android:layout_weight="1"
                android:background="@color/lightRed"
                android:text="Btn4"
                android:textAllCaps="false"
                android:textColor="@color/colorPrimary" />

        </LinearLayout>
    </LinearLayout>


</ScrollView>
```

### Prerequisites

 * Install [SDK](https://www.oracle.com/technetwork/java/javase/downloads/index.html)
 * Install [Android Studio](https://developer.android.com/studio)


## Gradle Dependency
```
dependencies {
    implementation fileTree(dir: 'libs', include: ['*.jar'])
    implementation 'com.android.support:appcompat-v7:28.0.0'
    implementation 'com.android.support.constraint:constraint-layout:1.1.3'
    // sdp-scalable size
    implementation 'com.intuit.sdp:sdp-android:1.0.6'
    testImplementation 'junit:junit:4.12'
    androidTestImplementation 'com.android.support.test:runner:1.0.2'
    androidTestImplementation 'com.android.support.test.espresso:espresso-core:3.0.2'
}
```

## Built With

* [JDK](https://www.oracle.com/technetwork/java/javase/downloads/index.html) - The JDK used
* [ANDROID STUDIO](https://developer.android.com/studio) - Android Studio
* [GITHUB](https://github.com/) - Github used
* [GIT FOR WINDOW](https://git-scm.com/download/win) - Used Git for window

## Device Output

<img src="device output.png" align="center" />

## Versioning

        * compileSdkVersion 28
        * minSdkVersion 19
        * targetSdkVersion 28
        * versionCode 1
        * versionName "1.0"
		
## Authors

* **Ranjeet Kumar** - *AndroidButton* - [decentjeet798](https://github.com/decentjeet798/AndroidButton)


## License

This project is open source for android developer

## Acknowledgments

* Fresher and experence anndroid developer
* Handlig click events on buttons
* etc

