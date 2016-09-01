package de.neofonie.mbak.appportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  public void buttonClicked(View view) {
    switch (view.getId()) {
      case R.id.movies_btn:
        break;
      case R.id.stock_btn:
        break;
      case R.id.bigger_btn:
        break;
      case R.id.material_btn:
        break;
      case R.id.ubiquitous_btn:
        break;
      case R.id.capstone_btn:
        break;
    }

    Button btn = (Button) view;

    Toast.makeText(this, "This button will launch my " + btn.getText() + " app!", Toast.LENGTH_SHORT).show();
  }
}
