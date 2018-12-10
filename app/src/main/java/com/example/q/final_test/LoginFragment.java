package com.example.q.final_test;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.content.Context.MODE_PRIVATE;

public class LoginFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_login, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initLoginBtn();
    }
    void initLoginBtn(){
        Button _loginBtn =(Button) getView().findViewById(R.id.login_btn);
        _loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText _name = (EditText) getView().findViewById(R.id.name_login);
                String name = _name.getText().toString();

                if(name.length() > 2 && name.equals(name.toUpperCase())){
                    SharedPreferences.Editor sp = getContext().getSharedPreferences( "name" ,MODE_PRIVATE).edit();
                    sp
                }
                else{
                    Log.d("Login", "FAIL");
                    Toast.makeText(getActivity(), "Pease more than 3 caractor and all uppercase",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
