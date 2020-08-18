package com.dkatlisLab.Reports;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reports {

	public static File dir;
	public static String path;
	public static ExtentHtmlReporter html;
	public static ExtentReports extent;
	public static ExtentTest test;

	static {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		Date date = new Date();
		System.out.println("Berita-" + dateFormat.format(date));
		path = System.getProperty("user.dir") + "//Reports//TMS-" + dateFormat.format(date);
		dir = new File(path);
		System.out.println("dirc Name==============" + dir);
		boolean successful = dir.mkdir();
		if (successful) {
			System.out.println("directory was created successfully");
		} else {
			System.out.println("failed trying to create the directory");

		}
	}
}