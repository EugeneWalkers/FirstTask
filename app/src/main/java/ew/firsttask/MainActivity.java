package ew.firsttask;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * this function returns the length of the input string * 2
     * @param inputString some input string
     * @author Evgeniy Skorohodov
     */
    public int doSmth(@NonNull String inputString){
        return inputString.length()*2;
    }

}
