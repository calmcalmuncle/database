package info.androidhive.tabsswipe;


import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

/**
 * A simple {@link Fragment} subclass.
 */
public class SetTimeFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener {

    private int hour_x, minute_x;

    public SetTimeFragment() {
        // Required empty public constructor
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        // Use the current date as the default date in the picker
        final Calendar c = Calendar.getInstance();
        hour_x = c.get(Calendar.HOUR_OF_DAY);
        minute_x = c.get(Calendar.MINUTE);


        // Create a new instance of DatePickerDialog and return it
        return new TimePickerDialog(getActivity(), this, hour_x, minute_x, false);
    }

    /*
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        TextView textView = new TextView(getActivity());
        textView.setText(R.string.hello_blank_fragment);
        return textView;
    }
    */

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

        Calendar c = Calendar.getInstance();
        c.set(Calendar.HOUR_OF_DAY, hourOfDay);
        c.set(Calendar.MINUTE, minute);

        //remove later
        Toast.makeText(getActivity(), hourOfDay + " : " + minute, Toast.LENGTH_SHORT).show();
    }
}
