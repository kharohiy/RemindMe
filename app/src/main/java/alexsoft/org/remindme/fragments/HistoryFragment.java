package alexsoft.org.remindme.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import alexsoft.org.remindme.R;

public class HistoryFragment extends AbstractTabFragment {
    private static final int LAYOUT = R.layout.fragment_example;

    public static HistoryFragment getInstance(Context context) {
        Bundle args = new Bundle();
        HistoryFragment historyFragment = new HistoryFragment();
        historyFragment.setArguments(args);
        historyFragment.setContext(context);
        historyFragment.setTitle(context.getString(R.string.tab_history));

        return historyFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);

        return view;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
