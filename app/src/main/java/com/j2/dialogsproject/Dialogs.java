package com.j2.dialogsproject;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;

import com.ontbee.legacyforks.cn.pedant.SweetAlert.SweetAlertDialog;

public class Dialogs {
    public static void successDialog(Context context) {
        //1.Success message
        new SweetAlertDialog(context, SweetAlertDialog.SUCCESS_TYPE)
                .setTitleText(context.getString(R.string.message_dialog))
                .show();
    }

    public static void warningDialog(Context context) {
        //2. Confirmation message
        new SweetAlertDialog(context, SweetAlertDialog.WARNING_TYPE)
                .setTitleText(context.getString(R.string.warning_dialog))
                .setContentText(context.getString(R.string.warnig_dialog_content))
                .setConfirmText(context.getString(R.string.confirm_to_delete))
                .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                    @Override
                    public void onClick(SweetAlertDialog sDialog) {
                        sDialog.dismissWithAnimation();
                    }
                })
                .setCancelClickListener(new SweetAlertDialog.OnSweetClickListener() {
                    @Override
                    public void onClick(SweetAlertDialog sweetAlertDialog) {
                        sweetAlertDialog.dismissWithAnimation();
                    }
                })
                .show();
    }

    public static void errorDialog(Context context) {
        //3. Error message
        new SweetAlertDialog(context, SweetAlertDialog.ERROR_TYPE)
                .setTitleText(context.getString(R.string.dialog_error))
                .setContentText(context.getString(R.string.dialog_error_content))
                .show();
    }

    public static void loadingDialog(Context context) {
        //4. Loading message
        SweetAlertDialog pDialog = new SweetAlertDialog(context, SweetAlertDialog.PROGRESS_TYPE);
        pDialog.getProgressHelper().setBarColor(Color.parseColor("#A5DC86"));
        pDialog.setTitleText(context.getString(R.string.loading));
        pDialog.setCancelable(true);
        pDialog.show();
    }

    public static void confirmSuccessDialog(final Context context) {
        //5. Confirm success
        new SweetAlertDialog(context, SweetAlertDialog.WARNING_TYPE)
                .setTitleText(context.getString(R.string.warning_dialog))
                .setContentText(context.getString(R.string.warnig_dialog_content))
                .setConfirmText(context.getString(R.string.confirm_to_delete))
                .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                    @Override
                    public void onClick(SweetAlertDialog sweetAlertDialog) {
                        sweetAlertDialog
                                .setTitleText(context.getString(R.string.deleted_dialog))
                                .setContentText(context.getString(R.string.deleted_dialog_content))
                                .setConfirmText(context.getString(R.string.ok_dialog))
                                .setConfirmClickListener(null)
                                .changeAlertType(SweetAlertDialog.SUCCESS_TYPE);
                    }
                })
                .show();
    }
}
