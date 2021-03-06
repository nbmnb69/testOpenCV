package ok;
import org.opencv.core.Mat;
import org.opencv.core.Scalar;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.core.Core;
public class Main{
	// To use in VSCode:
	// Download "Debugger for java"(extension) if you haven't
	// https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-debug
	// Click "Run" below 
	public static void main(String[] args){
		// Initialize
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		String src = "src/ok/img/src.jpg";
		String dest = "src/ok/img/dest.jpg";
		// Turn src.img to a mat
		Mat img = Imgcodecs.imread(src);

		// Process
		Scalar lowerb = new Scalar(75,200,200);
		Scalar upperb = new Scalar(85,255,255);
		Imgproc.cvtColor(img, img, Imgproc.COLOR_BGR2HSV);
		Core.inRange(img, lowerb, upperb, img);

		// Show the result

		// Show in pop up
		showResult.showRes(img);

		// Show in dest.jpg
		// Imgcodecs.imwrite(dest, img);
	}
}