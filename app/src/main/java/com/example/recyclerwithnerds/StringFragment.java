package com.example.recyclerwithnerds;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class StringFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.string_fragment, container, false);
        TextView textView = rootView.findViewById(R.id.text_view);
        textView.animate().rotation(5000).setDuration(10000);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SwitchFragment switchFragment  = new SwitchFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.fragment3, switchFragment).commit();
            }
        });

        return rootView;
    }
}
