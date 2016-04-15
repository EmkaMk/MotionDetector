package md.alarms;
import md.motiondetector.*;

public class TextAlarm  implements AlarmChannel{

	@Override
	public void sendAlarm() {
		// TODO Auto-generated method stub
		System.out.println("Motion has been detected");
		
	}

}
