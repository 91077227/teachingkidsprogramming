package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;
import org.teachingextensions.logo.utils.MVCUtils.Parser;
import org.teachingextensions.logo.utils.MVCUtils.Viewer;

public class AdLibsRtf
{
  public static class Words
  {
    // adverb
    private String adverb;
    // edverb
    private String edVerb;
    // bodyPart
    private String bodyPart;
  }
  public static void main(String[] args)
  {
    // MVC Pattern - Model, View, Controller
    Words words = new Words();
    words.adverb = MessageBox.askForTextInput("Enter an adverb");
    words.edVerb = MessageBox.askForTextInput("Enter a verb ending with -ed");
    words.bodyPart = MessageBox.askForTextInput("Enter a body part");
    String currentStory = Parser.parseRtfFile("view.rtf", words);
    //  Display the currentStory in an RTF file (use the Viewer object) --#1.3
    Viewer.displayRtfFile(currentStory);
  }
}