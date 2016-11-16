package org.teachingkidsprogramming.section05recursion;

import java.awt.Color;
import java.util.HashMap;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class TurtleTree
{
  @SuppressWarnings("unused")
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.getBackgroundWindow().setBackground(PenColors.Grays.Black);
    int branchLength = 60;
    drawBranch(branchLength);
  }
  private static void drawBranch(int branchLength)
  {
    if (branchLength > 0)
    {
      adjustColor();
      Tortoise.move(branchLength);
      drawLowerBranches(branchLength);
    }
  }
  private static void adjustColor()
  {
    HashMap<Integer, Color> colors = new HashMap<Integer, Color>();
    colors.put(10, PenColors.Greens.Lime);
    colors.put(20, PenColors.Greens.ForestGreen);
    colors.put(30, PenColors.Greens.DarkGreen);
    colors.put(40, PenColors.Greens.Olive);
    colors.put(50, PenColors.Browns.Sienna);
    //            A 60 pixel long branch is saddle brown (TIP: Put the values into the 'colors' HashMap)--#13 
    //            Get the value of the branch length from the 'colors' HashMap and use that to set the pen color --#21
  }
  private static void drawLowerBranches(int branchLength)
  {
    Tortoise.turn(30);
    drawShorterBranch(branchLength);
    Tortoise.turn(30);
    adjustColor();
    Tortoise.move(branchLength);
  }
  private static void drawShorterBranch(int branchLength)
  {
    drawBranch(branchLength - 10);
    Tortoise.turn(-60);
  }
}