/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
//package com.gradescope.pixlab;
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("images/beach.jpg");
    beach.explore(); // comment these out in repl.it
    beach.zeroBlue();
    beach.explore(); // comment these out in repl.it

    // uncomment this in repl.it to test your code!!
    // beach.write("imagesOutput/beach.jpg");
  }
  public static void testKeepOnlyBlue(){
    Picture beach = new Picture("images/beach.jpg");
    beach.keepOnlyBlue();
    beach.explore();
  }
  public static void testNegate(){
    Picture beach = new Picture("images/beach.jpg");
    beach.negate();
    beach.explore();
}
    public static void testGrayscale(){
        Picture beach = new Picture("images/beach.jpg");
        beach.grayscale();
        beach.explore();
    }
    public static void testMirrorDiagonal(){
        //challenge method
        Picture beach = new Picture("images/beach.jpg");
        beach.mirrorDiagonal();
        beach.explore();
    }
  public static void testMirrorArms(){
    Picture snowman = new Picture("images/snowman.jpg");
    snowman.mirrorArms();
    snowman.explore();
  }
    public static void testMirrorGull(){
        Picture seagull = new Picture("images/seagull.jpg");
        seagull.mirrorGull();
        seagull.explore();
    }
  public static void testMirrorHorizontal(){
    Picture beach = new Picture("images/beach.jpg");
    beach.mirrorHorizontal();
    beach.explore();
  }
  public static void testverticleRightToLeft(){
    Picture beach = new Picture("images/unicorn.jpg");
    beach.mirrorVerticalRightToLeft();
    beach.explore();
  }
  public static void testMirrorHorizontalBotToTop(){
    Picture beach = new Picture("images/unicorn.jpg");
    beach.mirrorHorizontalBotToTop();
    beach.explore();
  }
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.mirrorVertical();
    beach.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("images/temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
    public static void testMirrorUnicorn()
    {
        Picture temple = new Picture("images/unicorn.jpg");
        temple.explore();
        temple.mirrorUnicorn();

    }
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("images/640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
    public static void testMycollage()
    {
        Picture canvas = new Picture("images/640x480.jpg");
        canvas.myCollage();
        canvas.explore();
    }
    public static void testSecondcopy()
    {
        Picture beach = new Picture("images/beach.jpg");
        beach.secondcopy(beach,0,0,200,200);
        beach.explore();
    }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("images/swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
    public static void testEdgeDetection2()
    {
        Picture swan = new Picture("images/swan.jpg");
        swan.edgeDetection2(10);
        swan.explore();
    }
  /** Method to set the blue to 255 */

  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorHorizontal();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
     // testSecondcopy();
      testMycollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
    //testverticleRightToLeft();
      //testMirrorUnicorn();
      //testMirrorHorizontalBotToTop();
  }
}