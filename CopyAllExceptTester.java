package gitlet;

import gitlet.FileHelper;
import java.io.File;

public class CopyAllExceptTester {
  public static void main(String[] args) {
    File firstDir = new File("/Users/Sam54123/Documents/Robotics/ControlsCourse/Gitlet");
    File destDir = new File("/Users/Sam54123/Documents/Robotics/ControlsCourse/Gitlet2");
    try {
      FileHelper.copyAllExcept(firstDir,destDir,"gitlet-skeleton");
    }
    catch(Exception e) {
      System.out.println(e.toString()); 
    }
  }
}
