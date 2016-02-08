package info.androidhive.tabsswipe;

import android.app.DialogFragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.Calendar;

public class Fragment2 extends Fragment {


	private Button mSetTimeButton;
	public int hour_x, minute_x;

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_2, container, false);

		final Calendar cal = Calendar.getInstance();
		hour_x = cal.get(Calendar.HOUR_OF_DAY);
		minute_x = cal.get(Calendar.MINUTE);

		showDialogOnButtonClick(rootView);

		return rootView;
	}

	public void showDialogOnButtonClick(View v) {

		mSetTimeButton = (Button)v.findViewById(R.id.setTimeButton);

		mSetTimeButton.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				DialogFragment picker = new SetTimeFragment();
				picker.show(getActivity().getFragmentManager(), "timePicker");
			}
		});
	}
}
