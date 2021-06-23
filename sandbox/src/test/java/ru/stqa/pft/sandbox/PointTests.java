package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {
    @Test
    public void testDistance(){
        Point p1 = new Point(1,1);
        Point p2 = new Point(1,3);
        Assert.assertEquals(p1.distance(p2),2);
    }
    @Test
    public void testDistance2(){
        Point p1 = new Point(1,1);
        Point p2 = new Point(1,4);
        Assert.assertEquals(p1.distance(p2),3);
    }
    @Test
    public void testDistance3(){
        Point p1 = new Point(1,-2);
        Point p2 = new Point(1,3);
        Assert.assertEquals(p1.distance(p2),6);
    }

    @Test
    public void testDistance4(){
        Point p1 = new Point(1,-2);
        Point p2 = new Point(0.1,3);
        Assert.assertEquals(p1.distance(p2),6);
    }


}
