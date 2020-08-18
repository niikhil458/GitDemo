package com.dkatlisLab.Reports;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;




public class TestNGListener implements ITestListener {


	public void onTestStart(ITestResult result) {
		System.out.println("--------------------------------------------------------");
		System.out.println("TestCase started and details are :"+result.getName());
		System.out.println("--------------------------------------------------------");

		}

	public void onTestSuccess(ITestResult result) {
		System.out.println("--------------------------------------------------------");
		System.out.println("TestCase succeed and details are :"+result.getName());
		System.out.println("--------------------------------------------------------");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("--------------------------------------------------------");
		System.out.println("TestCase Failed and details are :"+result.getName());
		System.out.println("--------------------------------------------------------");

	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("---------------");
		System.out.println("TestCase skipped and details are :"+result.getName());
		System.out.println("---------------");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext result) {
		System.out.println("-----------------------------------------------------");
		System.out.println("Execution started and details are :"+result.getName());
		System.out.println("-----------------------------------------------------");
	}

	public void onFinish(ITestContext result) {
		System.out.println("----------------------------------------------------");
		System.out.println("Execution Ended  and details are :"+result.getName());
		System.out.println("----------------------------------------------------");
	}

	
}
