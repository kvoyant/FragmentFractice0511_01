package com.tjeit.fragmentfractice0511_01.fragments;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tjeit.fragmentfractice0511_01.MainActivity;
import com.tjeit.fragmentfractice0511_01.R;
import com.tjeit.fragmentfractice0511_01.databinding.FragmentOneBinding;

public class FragmentOne extends Fragment {

    FragmentOneBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.fragment_one, container, false);
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_one, container, false);

        return binding.getRoot();

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        TextView myTextView = getActivity().findViewById(R.id.myTextView);
//        myTextView.setText("JAVA");

        binding.myTextView.setText("데이터 바인딩 이용");

        binding.okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = binding.titleEdt.getText().toString();

                getActivity().setTitle(title);
            }
        });

    }

    public void changeTextMsg(String inputMessage) {
        binding.myTextView.setText(inputMessage);
    }
}
