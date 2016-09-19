package android.lanciotti.com.android_sample_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button button = null;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) this.findViewById( R.id.button );
        button.setText( "modificato-" + button.getText() );


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((Button) view).setText( "click!" );
            }
        });



    }
}
