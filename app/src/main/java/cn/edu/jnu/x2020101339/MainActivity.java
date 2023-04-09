package cn.edu.jnu.x2020101339;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonCalculate=this.findViewById(R.id.button);
        EditText editTextScores=this.findViewById(R.id.editTextTextPersonName);
        TextView textViewscores=this.findViewById(R.id.textView);
        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String scores=editTextScores.getText().toString();
                String []arraySores=scores.split(",");
                Game game=new Game();
                for(int i=0;i<arraySores.length;i++){
                    game.roll(Integer.parseInt(arraySores[i]));
                }
                textViewscores.setText("Total score is:"+Integer.toString(game.score()));
            }
        });
    }
}