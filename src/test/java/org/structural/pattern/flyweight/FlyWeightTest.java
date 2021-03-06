package org.structural.pattern.flyweight;

import java.util.Random;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.structural.pattern.flyweight.BALL_COLOR;
import org.structural.pattern.flyweight.Ball;
import org.structural.pattern.flyweight.BallFactory;

public class FlyWeightTest {

	@Test
	public void testFlyWeight() throws Exception {
		Random r = new Random();
		BALL_COLOR[] values = BALL_COLOR.values();

		for (int i = 0; i < 1000; i++) {
			BallFactory.createBall(i, values[r.nextInt(values.length)]);
		}

		assertTrue(BallFactory.numberOfBallObjectsCreated() <= values.length);
		assertTrue(Ball.ballCounter < 1000);
	}

}
