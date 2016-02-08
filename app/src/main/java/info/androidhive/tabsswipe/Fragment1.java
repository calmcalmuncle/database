package info.androidhive.tabsswipe;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

import java.util.Calendar;

public class Fragment1 extends Fragment {

	private Button mSetDateButton;
	public int year_x, month_x, day_x;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_1, container, false);

		final Calendar cal = Calendar.getInstance();
		year_x = cal.get(Calendar.YEAR);
		month_x = cal.get(Calendar.MONTH);
		day_x = cal.get(Calendar.DAY_OF_MONTH);

        showDialogOnButtonClick(rootView);

		return rootView;
	}

	public void showDialogOnButtonClick(View v) {

		mSetDateButton = (Button) v.findViewById(R.id.setDateButton);

		mSetDateButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                android.support.v4.app.DialogFragment picker = new SetDateFragment();
                picker.show(getFragmentManager(), "datePicker");
                
            }
        });
	}

}
