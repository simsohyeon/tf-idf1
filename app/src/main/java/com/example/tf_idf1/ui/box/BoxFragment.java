package com.example.tf_idf1.ui.box;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.tf_idf1.R;

public class BoxFragment extends Fragment {

    private BoxViewModel boxViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        boxViewModel =
                new ViewModelProvider(this).get(BoxViewModel.class);
        View root = inflater.inflate(R.layout.fragment_box, container, false);
        final TextView textView = root.findViewById(R.id.text_box);
        boxViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}