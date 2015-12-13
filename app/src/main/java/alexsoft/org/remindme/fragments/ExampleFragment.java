package alexsoft.org.remindme.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import alexsoft.org.remindme.R;

public class ExampleFragment extends Fragment {
    private static final int LAYOUT = R.layout.fragment_example;

    private View view;

    public static ExampleFragment getInstance() {
        Bundle args = new Bundle();
        ExampleFragment exampleFragment = new ExampleFragment();
        exampleFragment.setArguments(args);

        return exampleFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);

        return view;
    }
}
