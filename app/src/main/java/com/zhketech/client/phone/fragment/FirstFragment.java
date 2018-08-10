package com.zhketech.client.phone.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zhketech.client.phone.R;
import com.zhketech.client.phone.utils.Logutils;

public class FirstFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Logutils.i("FirstFragment:onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Logutils.i("FirstFragment:onCreateView");
        return inflater.inflate(R.layout.first_fragmetn_layout, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Logutils.i("FirstFragment:onActivityCreated");
    }

    @Override
    public void onPause() {
        super.onPause();
        Logutils.i("FirstFragment:onPause");
    }

    @Override
    public void onStart() {
        super.onStart();
        Logutils.i("FirstFragment:onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Logutils.i("FirstFragment:onResume");
    }

    @Override
    public void onStop() {
        super.onStop();
        Logutils.i("FirstFragment:onStop");
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Logutils.i("FirstFragment:onAttach");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Logutils.i("FirstFragment:onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Logutils.i("FirstFragment:onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Logutils.i("FirstFragment:onDetach");
    }

}
