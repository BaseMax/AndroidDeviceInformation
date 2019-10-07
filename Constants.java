package org.aterd.lib.Global;

import android.os.Build;
import android.util.DisplayMetrics;

public class Constants {
	
	public static String getDetails() {
		String details="";
		try {
			details+="OS version: "+System.getProperty("os.version").toString()+"\n";
			details+="API Level: "+android.os.Build.VERSION.SDK.toString()+"\n";
			details+="Device: "+android.os.Build.DEVICE.toString()+"\n";
			details+="Model: "+android.os.Build.MODEL.toString()+"\n";
			details+="Product: "+android.os.Build.PRODUCT.toString()+"\n";
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		try {
			details+= "VERSION.RELEASE : "+ Build.VERSION.RELEASE
				+"\nVERSION.INCREMENTAL : "+Build.VERSION.INCREMENTAL
				+"\nVERSION.SDK.NUMBER : "+Build.VERSION.SDK_INT
				+"\nBOARD : "+Build.BOARD
				+"\nBOOTLOADER : "+Build.BOOTLOADER
				+"\nBRAND : "+Build.BRAND
				+"\nCPU_ABI : "+Build.CPU_ABI
				+"\nCPU_ABI2 : "+Build.CPU_ABI2
				+"\nDISPLAY : "+Build.DISPLAY
				+"\nFINGERPRINT : "+Build.FINGERPRINT
				+"\nHARDWARE : "+Build.HARDWARE
				+"\nHOST : "+Build.HOST
				+"\nID : "+Build.ID
				+"\nMANUFACTURER : "+Build.MANUFACTURER
				+"\nMODEL : "+Build.MODEL
				+"\nPRODUCT : "+Build.PRODUCT
				+"\nSERIAL : "+Build.SERIAL
				+"\nTAGS : "+Build.TAGS
				+"\nTIME : "+Build.TIME
				+"\nTYPE : "+Build.TYPE
				+"\nUNKNOWN : "+Build.UNKNOWN
				+"\nUSER : "+Build.USER+"\n";
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		try {
			// MyApplication.java is main application class
			int width= MyApplication.getContext().getResources().getDisplayMetrics().widthPixels;
			details+="ScreenWidth: "+String.valueOf(width)+"\n";
			int height= MyApplication.getContext().getResources().getDisplayMetrics().heightPixels;
			details+="ScreenHeight: "+String.valueOf(height)+"\n";
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		try {
			DisplayMetrics metrics = MyApplication.getContext().getResources().getDisplayMetrics();
			int densityDpi = (int)(metrics.density * 160f);
			details+="Density: "+String.valueOf(metrics.density)+"\n";
			details+="DensityDpi: "+String.valueOf(densityDpi)+"\n";
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return details;
	}
}
