package uz.oydinbek.newprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ActionMenuView;
import android.widget.ImageView;

import uz.oydinbek.newprogram.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       binding= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.text1.setText("Siz Fulfil markazini tanladingiz tanlovingiz uchun raxmat!");
            }
        });
      binding.image2.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              binding.text1.setText("Siz PDP markazini tanladingiz tanlovingiz uchun raxmat!");
          }
      });
        binding.image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.text1.setText("Siz MOHIRDEV markazini tanladingiz tanlovingiz uchun raxmat!");
            }
        });
        binding.image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.text1.setText("Siz NAJOT TA'LIM markazini tanladingiz tanlovingiz uchun raxmat!");
            }
        });



    }
}