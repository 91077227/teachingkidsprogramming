package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class Spiral
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    //    Add Blue Violet to the Color Wheel --#7 HINT: Use the ColorWheel object
    //    Add Violet to the Color Wheel --#8
    //    Add Purple to the Color Wheel --#9
    for (int i = 0; i < 75; i++)
    {
      try
      {
        //         Change the pen color of the line the tortoise draws the next color on the Color Wheel --#6
        Tortoise.turn(50);
      }
      catch (RuntimeException re)
      {
        MessageBox.showMessage("Hold up: " + re);
      }
      //    Repeat --#3.2
    }
  }
}