package com.lpalma92.coursera.project.modernartui;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;

public class MoreInfoDialog extends DialogFragment {

	String URL= "http://www.moma.org";
	
	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
		LayoutInflater inflate = getActivity().getLayoutInflater();
		builder.setView(inflate.inflate(R.layout.dialog_view,null)).setPositiveButton(
				R.string.dialog_visit, new OnClickListener() {

					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(URL));
						startActivity(intent);
					}
				}).setNegativeButton(R.string.dialog_notNow, null);
		return builder.create();
	}
}
