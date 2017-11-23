package edu.uwec.cs.robotics.kinsim;



import java.awt.*;
import java.awt.geom.*;
import java.util.*;

public class Robot {

	RobotPanel rp;
	KinSim ks;

	ArrayList<Link> links;

	public Robot(RobotPanel rp, KinSim ks) {
		// Remember the robot panel and the kin sim GUI for repainting and slider adjustment
		this.rp = rp;
		this.ks = ks;
		
		// Define the links of the robot
		links = new ArrayList<Link>();
		links.add(new Link(0, Color.black));  // There is no link 0 so we just put a 0 length Link in this position to represent the base
		
		// Add the actual links (hard-coded)
		links.add(new Link(50, Color.red));
		links.add(new Link(70, Color.blue));
		links.add(new Link(30, Color.cyan));
		
	}
	
	// Callback for the GUI sliders to perform forward kin
	public void adjustRotation(int joint, double value) {
		if (joint < links.size()) {
			links.get(joint).setJointValue(value);
		
			// Draw the result on the screen
			rp.repaint();
		}
	}
	
	
	// Should be coded using gradient following
	// The following link for inverse kin gradient following is useful:
	// http://freespace.virgin.net/hugo.elias/models/m_ik2.htm
	//
	// Remember that the call to this method is threaded so you can
	// repaint the robotPanel and update the kinsim GUI's sliders as you
	// update the joint positions.
	// You might also want to include a slight delay (Thread.sleep) to make
	// the motion look smoother.
	public void inverseKin(Point2D goal) {
		Point2D robot = new Point(250,250);
		double totalLength = 0;
		double distance =  robot.distance(goal);
		for (Link l : links) {
			totalLength += l.getLength();
		}
		if (distance <= totalLength) {
			ks.changeSliderValue(1, distance);
			Math.acos( );
			

		} else {
			
		}

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	

	// Draw is called by the robotPanel when it needs to display the links on the screen
	// You need to setup the proper AffineTransform and pass it to each link as the chain gets drawn
	// Note that these AffineTransforms are only planar (3x3 rather than 4x4 matrices).
	// You may hard-code that the base of the robot is at (250,250)
	// Note that you do not need to draw link 0, but may need its information for forming the transforms
	public void draw(Graphics g) {
		AffineTransform at = new AffineTransform();
		Link link0 = links.get(0);
		Link link1 = links.get(1);
		Link link2 = links.get(2);
		Link link3 = links.get(3);

		// Hard Coded Base of Robot Translation
		at.translate(250, 250);
		link0.draw(g, at);

		at.translate(0, 0);
		at.rotate(Math.toRadians(link1.getJointValue()), 0, 0);
		link1.draw(g, at);

		at.translate(50, 0);
		at.rotate(Math.toRadians(link2.getJointValue()), 0, 0);
		link2.draw(g, at);

		at.translate(70, 0);
		at.rotate(Math.toRadians(link3.getJointValue()), 0, 0);
		link3.draw(g, at);
	}
		
}