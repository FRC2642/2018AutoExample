package org.usfirst.frc.team2642.robot;

import java.util.ArrayList;

import org.opencv.core.MatOfPoint;
import org.opencv.core.Rect;
import org.opencv.imgproc.Imgproc;

public class VisionTargetInfo {
	private static int numTargets = 0;
	private static Rect targetRect;
	private static final Object targetImgLock = new Object();
	private static double targetCenterX = Double.MAX_VALUE;
	private static double targetCenterY = Double.MAX_VALUE;
	private static double targetArea = Double.MAX_VALUE;

	public static void setFilterContours(ArrayList<MatOfPoint> matOfPoints)
	{
		synchronized (targetImgLock)
		{
			if (matOfPoints.size() >= 1)
			{
				numTargets = 1;
				targetRect = Imgproc.boundingRect(matOfPoints.get(0));
				targetCenterX = targetRect.x + (targetRect.width / 2);
				targetCenterY = targetRect.y + (targetRect.height /2);
				targetArea = targetRect.area();
			}
			else
			{
				numTargets = 0;
				targetCenterX = Double.MAX_VALUE;
				targetCenterY = Double.MAX_VALUE;
				targetArea = Double.MAX_VALUE;
			}
		}
	}
	
	public static double getTargetCenterX()
	{
		return targetCenterX;
	}
	
	public static double getTargetCenterY()
	{
		return targetCenterY;
	}
	
	public static double getTargetArea()
	{
		return targetArea;
	}
	
	public static int getNumTargets()
	{
		return numTargets;
	}
}
