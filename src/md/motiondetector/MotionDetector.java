package md.motiondetector;
import md.alarms.*;
import md.imagecapture.*;

public class MotionDetector implements MotionDetectorImplementation {

	private ImageCaptureDevice imageCapture;
	private String image1;
	private String image2;
	AlarmChannel channel;

	public MotionDetector(AlarmChannel ch,ImageCaptureDevice imageCapture) {
		super();
		this.imageCapture = imageCapture;
		this.channel=ch;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		boolean noMotion = true;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		image1 = imageCapture.enterImage();
		while (noMotion) {
			
			image2 = imageCapture.enterImage();
			if(turnOff())
			{
				System.out.println("Monitor turned off");
				break;
			}
			if (!image1.equals(image2)) {
				noMotion = false;
				channel.sendAlarm();
			}
		}

	}

	@Override
	public boolean turnOff() {
		// TODO Auto-generated method stub
		if(image1.equals("") || image2.equals(""))
		{
			return true;
		}
		return false;
		
		
	}
	
	

}
