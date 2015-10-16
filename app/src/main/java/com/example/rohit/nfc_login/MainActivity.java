package com.example.rohit.nfc_login;


        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;

        import com.parse.ParseAnonymousUtils;
        import com.parse.ParseUser;

public class MainActivity extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        // Determine whether the current user is an anonymous user
       if (ParseAnonymousUtils.isLinked(ParseUser.getCurrentUser())) {
            // If user is anonymous, send the user to LoginSignupActivity.class
            Intent intent = new Intent(MainActivity.this,
                    LoginSignupActivity.class);
            startActivity(intent);
            finish();
       }
    else
       {
            // If current user is NOT anonymous user
            // Get current user data from Parse.com
            ParseUser currentUser = ParseUser.getCurrentUser();
            if (currentUser != null) {
                // Send logged in users to Welcome.class
                Intent intent1 = new Intent(MainActivity.this, Welcome.class);
                startActivity(intent1);
                finish();
            } else {
                // Send user to LoginSignupActivity.class
                Intent intent2 = new Intent(MainActivity.this,
                        LoginSignupActivity.class);
                startActivity(intent2);
                finish();
            }
       }


    }
}