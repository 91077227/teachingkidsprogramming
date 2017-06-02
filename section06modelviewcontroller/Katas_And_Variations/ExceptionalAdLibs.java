package org.teachingkidsprogramming.section06modelviewcontroller.Katas_And_Variations;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class ExceptionalAdLibs
{
  public static void main(String[] args)
  {
    String adverb = askAdverb();
    MessageBox.showMessage("The adverb is " + adverb);
    String edverb = askEdverb();
    MessageBox.showMessage("The verb is " + edverb);
    String bodyPart = askBodyPart();
    MessageBox.showMessage("The body part is " + bodyPart);
  }
  public static String askAdverb()
  {
    String adverb = MessageBox.askForTextInput("What is the adverb?");
    if (adverb.isEmpty())
    {
      MessageBox.showMessage("Enter an adverb, please?");
      adverb = askAdverb();
    }
    if (adverb.matches("[\\d]*")) //
    {
      MessageBox.showMessage("Do not enter numbers!");
      adverb = askBodyPart();
    }
    return adverb;
  }
  public static String askEdverb()
  {
    String edverb = MessageBox.askForTextInput("What is the -ed verb?");
    if (edverb.isEmpty())
    {
      MessageBox.showMessage("Enter a verb ending in -ed, please?");
      edverb = askAdverb();
    }
    if (edverb.matches("[\\d]*"))
    {
      MessageBox.showMessage("Do not enter numbers!");
      edverb = askBodyPart();
    }
    return edverb;
  }
  public static String askBodyPart()
  {
    String bodyPart = MessageBox.askForTextInput("What is the -ed verb?");
    if (bodyPart.isEmpty())
    {
      MessageBox.showMessage("Enter a verb ending in -ed, please?");
      bodyPart = askBodyPart();
    }
    if (bodyPart.matches("[\\d]*"))
    {
      MessageBox.showMessage("Do not enter numbers!");
      bodyPart = askBodyPart();
    }
    return bodyPart;
  }
}