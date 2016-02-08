package info.androidhive.tabsswipe;


import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.widget.DatePicker;
import android.widget.Toast;
import java.util.Calendar;

/**
 * A simple {@link Fragment} subclass.
 */
public class SetDateFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {

    private int year_x, month_x, day_x;

    public SetDateFragment() {
        // Required empty public constructor
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        // Use the current date as the default date in the picker
        final Calendar c = Calendar.getInstance();
        year_x = c.get(Calendar.YEAR);
        month_x = c.get(Calendar.MONTH);
        day_x = c.get(Calendar.DAY_OF_MONTH);

        // Create a new instance of DatePickerDialog and return it
        return new DatePickerDialog(getActivity(), this, year_x, month_x, day_x);
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int day) {

        Calendar c = Calendar.getInstance();
        c.set(year, month, day);

        //remove later
        Toast.makeText(getActivity(), year + " / " + month + " / " + day, Toast.LENGTH_SHORT).show();

        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //String formattedDate = sdf.format(c.getTime());
    }
}
