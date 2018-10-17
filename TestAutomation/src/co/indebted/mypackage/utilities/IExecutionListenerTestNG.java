package co.indebted.mypackage.utilities;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.testng.IExecutionListener;

public class IExecutionListenerTestNG implements IExecutionListener{

	private long startTime;
	
	@Override
	public void onExecutionStart() {
		startTime = System.currentTimeMillis();
		String timeStamp = new SimpleDateFormat("HH:mm:ss	dd/MM/yyyy").format(Calendar.getInstance().getTime());
		System.out.println("Test started at : " + timeStamp);
	}

	@Override
	public void onExecutionFinish() {
		System.out.println("Total time of testing : " + ((System.currentTimeMillis()) - startTime) + "ms");
	}

}
