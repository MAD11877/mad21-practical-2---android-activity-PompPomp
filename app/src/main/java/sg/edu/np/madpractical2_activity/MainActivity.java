package sg.edu.np.madpractical2_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    User newUser = new User("Joe Jim", "Hi there! I am a certified psychiatrist in the field of CyberSecurity and I am over qualified to be of service to you!", 12, false);

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView title = findViewById(R.id.title);
        title.setText(newUser.Name);

        TextView desc = findViewById(R.id.description);
        desc.setText(newUser.Description);
        initialise(newUser);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Button followButton = findViewById(R.id.fbutton);
        followButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (followButton.getText() == "Follow"){
                    followButton.setText("UnFollow");
                    newUser.Followed = true;
                }
                else{
                    followButton.setText("Follow");
                    newUser.Followed = false;
                }
            }
        });
    }

    public void initialise(User user) {
        Button followButton = findViewById(R.id.fbutton);
        if (user.Followed) {
            followButton.setText("UnFollow");
        } else {
            followButton.setText("Follow");
        }
    }
}
