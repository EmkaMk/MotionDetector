package md.imagecapture;
import java.io.InputStream;
import md.motiondetector.*;
import java.util.Scanner;

public class CameraImageCapture implements ImageCaptureDevice {
	
	private String picture;

	public CameraImageCapture() {
		super();
	}
	
	public String enterImage()
	{
		Scanner sc=new Scanner(System.in);
		picture=sc.nextLine();
		return picture;
	}

}
