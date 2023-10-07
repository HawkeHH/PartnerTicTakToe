package com.zybooks.tiktactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TicTakToeGame game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        game = new TicTakToeGame();

        // Initialize the game grid
        GridLayout gridLayout = findViewById(R.id.tiktok_grid);
        for (int i = 0; i < gridLayout.getChildCount(); i++) {
            Button button = (Button) gridLayout.getChildAt(i);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onGridButtonClick((Button) v);
                }
            });
        }
    }

    private void onGridButtonClick(Button button) {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.appbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.action_Newgame) {

            Toast.makeText(this, "Restarting the game", Toast.LENGTH_SHORT).show();
             // need to add newgame() call once made.


            return true;
        } else if (itemId == R.id.action_Exit) {
            // Exit the app
            // need to add dioloauge accepte decln message.
            finish();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }
}
