package md.alarms;

import md.imagecapture.CameraImageCapture;
import md.motiondetector.*;

public class MotionDetectorApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlarmChannel text=new TextAlarm();
		ImageCaptureDevice device=new CameraImageCapture();
		MotionDetector detector=new MotionDetector(text,device);
		detector.run();

	}

}
