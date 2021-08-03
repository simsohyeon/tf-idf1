package com.example.tf_idf1.ui.good;

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

public class GoodFragment extends Fragment {

    private GoodViewModel goodViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        goodViewModel =
                new ViewModelProvider(this).get(GoodViewModel.class);
        View root = inflater.inflate(R.layout.fragment_good, container, false);
        final TextView textView = root.findViewById(R.id.text_good);
        goodViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}