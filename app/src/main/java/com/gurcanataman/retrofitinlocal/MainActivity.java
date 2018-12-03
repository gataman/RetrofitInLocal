package com.gurcanataman.retrofitinlocal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;
import com.gurcanataman.retrofitinlocal.Model.ResponseCRUD;
import com.gurcanataman.retrofitinlocal.RestApi.ManagerAll;
import com.gurcanataman.retrofitinlocal.classes.User;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    EditText etUserName, etPassword;
    Button btnSaveUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
    }

    private void initUI() {
        etUserName = findViewById(R.id.etUserName);
        etPassword = findViewById(R.id.etPassword);
        btnSaveUser = findViewById(R.id.btnSave);
        btnSaveUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveUser();
            }
        });

    }

    private void saveUser() {
        String userName = etUserName.getText().toString();
        String userPassword = etPassword.getText().toString();

        final User user =new User(userName,userPassword);


        Call<ResponseCRUD> x = ManagerAll.getInstance().kullaniciEkle(user);

        x.enqueue(new Callback<ResponseCRUD>() {
            @Override
            public void onResponse(Call<ResponseCRUD> call, Response<ResponseCRUD> response) {

                if (response.body() !=null){
                    Log.e("GELEN JSON", "" + new Gson().toJson(response.body()));

                    Toast.makeText(getApplicationContext(),"basarili kayit",Toast.LENGTH_LONG).show();
                }

            }

            @Override
            public void onFailure(Call<ResponseCRUD> call, Throwable t) {
                Log.i("dene","basarisiz");
                Toast.makeText(getApplicationContext(),"basarisiz kayit"+t.toString(),Toast.LENGTH_LONG).show();


            }
        });





    }
}
