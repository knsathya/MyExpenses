package org.totschnig.myexpenses.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.totschnig.myexpenses.R;
import org.totschnig.myexpenses.model.Plan;

import java.util.List;

public class RecurrenceAdapter extends ArrayAdapter<Plan.Recurrence> {

  public RecurrenceAdapter(Context context, boolean withoutOneTime) {
    super(context, android.R.layout.simple_spinner_item,
        withoutOneTime? Plan.Recurrence.valuesWithoutOneTime() : Plan.Recurrence.values());
    setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
  }

  @Override
  public View getView(int position, View convertView, ViewGroup parent) {
    View result = super.getView(position, convertView, parent);
    ((TextView) result).setText(getItem(position).getLabel(getContext()));
    return result;
  }

  @Override
  public View getDropDownView(int position, View convertView, ViewGroup parent) {
    View result = super.getDropDownView(position, convertView, parent);
    ((TextView) result).setText(getItem(position).getLabel(getContext()));
    return result;
  }
}
