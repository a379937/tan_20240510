package p0322;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.github.sarxos.webcam.Webcam;

public class WebcamControl {

	    public static void main(String[] args) throws IOException {
	        Webcam webcam = Webcam.getDefault();
	        if (webcam != null) {
	            System.out.println("Webcam: " + webcam.getName());
	            webcam.open();
	            BufferedImage image = webcam.getImage();
	            ImageIO.write(image, "PNG", new File("webcam-capture.png"));
	        } else {
	            System.out.println("Failed: Webcam Not Found Error");
	        }
	    }
	}
