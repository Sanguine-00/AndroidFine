package com.yuzhi.fine.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.yuzhi.fine.R;
import com.yuzhi.fine.activity.Btn4SActivity;
import com.yuzhi.fine.activity.BtnGasActivity;
import com.yuzhi.fine.activity.BtnGuideActivity;
import com.yuzhi.fine.activity.BtnMapPreferenceSettingActivity;
import com.yuzhi.fine.activity.BtnParkingActivity;
import com.yuzhi.fine.activity.BtnRoutePlanResultActivity;
import com.yuzhi.fine.activity.BtnTrafficConditionActivity;
import com.yuzhi.fine.activity.BtnInsuranceActivity;
import com.yuzhi.fine.activity.HouseDetailActivity;
import com.yuzhi.fine.activity.LoginActivity;
import com.yuzhi.fine.activity.MainActivity;
import com.yuzhi.fine.activity.BtnRoutePlanActivity;
import com.yuzhi.fine.utils.ConstantValues;

/**
 * 应用程序UI工具包：封装UI相关的一些操作
 */
public class UIHelper {

    public final static String TAG = "UIHelper";

    public final static int RESULT_OK = 0x00;
    public final static int REQUEST_CODE = 0x01;

    public static void ToastMessage(Context cont, String msg) {
        if (cont == null || msg == null) {
            return;
        }
        Toast.makeText(cont, msg, Toast.LENGTH_SHORT).show();
    }

    public static void ToastMessage(Context cont, int msg) {
        if (cont == null || msg <= 0) {
            return;
        }
        Toast.makeText(cont, msg, Toast.LENGTH_SHORT).show();
    }

    public static void ToastMessage(Context cont, String msg, int time) {
        if (cont == null || msg == null) {
            return;
        }
        Toast.makeText(cont, msg, time).show();
    }

    public static void showHome(Activity context) {
        Intent intent = new Intent(context, MainActivity.class);
        context.startActivity(intent);
    }

    public static void showLogin(Activity context) {
        Intent intent = new Intent(context, LoginActivity.class);
        context.startActivity(intent);
    }

    public static void showHouseDetailActivity(Activity context) {
        Intent intent = new Intent(context, HouseDetailActivity.class);
        context.startActivity(intent);
    }

    public static void showBtnParkingActivity(Activity context) {
        Intent intent = new Intent(context, BtnParkingActivity.class);
        context.startActivity(intent);
    }

    public static void showBtnGasActivity(Activity context) {
        Intent intent = new Intent(context, BtnGasActivity.class);
        context.startActivity(intent);
    }

    public static void showBtnHomeTmcActivity(Activity context) {
        Intent intent = new Intent(context, BtnTrafficConditionActivity.class);
        context.startActivity(intent);
    }

    public static void showBtn4SActivity(Activity context) {
        Intent intent = new Intent(context, Btn4SActivity.class);
        context.startActivity(intent);
    }

    public static void showRoutePlanResultActivity(Activity context){
        Intent intent = new Intent(context,BtnRoutePlanResultActivity.class);
        context.startActivity(intent);
    }

    public static void showBtnInsurance(Activity context) {
        Intent intent = new Intent(context, BtnInsuranceActivity.class);
        context.startActivity(intent);
    }

    public static void showBtnMapPreferenceSettingActivity(Activity context) {
        Intent intent = new Intent(context, BtnMapPreferenceSettingActivity.class);
        context.startActivityForResult(intent, ConstantValues.PREFERENCE_SET_REQUEST_CODE);
    }

    public static void showBtnGuideActivity(Activity context) {
        Intent intent = new Intent(context, BtnGuideActivity.class);
        context.startActivityForResult(intent, ConstantValues.NAVIGATION_REQUEST_CODE);
    }

    public static void showRoutePlanActivity(Activity context) {
        Intent intent = new Intent(context, BtnRoutePlanActivity.class);
        context.startActivity(intent);
    }

}
