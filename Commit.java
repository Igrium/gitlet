package gitlet;

import java.util.*;
import java.io.File;
import gitlet.Utils;
import java.nio.file;


class Commit implements java.io.Serializable {
  private String parent;
  private Date commitDate;
  private String id;
  private String branch;
  private ArrayList<File> tracked;
  private String message;
  private boolean inProgress = true;

  public String getParent() {
    return parent;
  }
  public Date getCommitDate() {
    return commitDate;
  }
  public void setMessage(String msg) {
    if (inProgress) {
      message = msg;
    } else {
      System.out.println("You cannot edit the message of an already made commit.");
      System.exit(0);
    }
  } //end method
  public String getMessage() {
    return message;
  }

  public Commit(String par, ArrayList<File> track) {
    commitDate = new Date();
    parent = par;
    id = sha1(this);
    tracked = track;
  }
  public void saveCommit(File workingDir) {
    File gitletDir = new File(".gitlet");
    if (gitletDir.exists()) {
      //create commit directory
      File commitDir = new File(".gitlet/"+branch+"/"+id);
      try {
        commitDir.mkdir();
      }
      catch(SecurityException se){
        System.out.println("Insuffuciant permissions.");
        System.exit(0);
      }
      catch(Exception e) {
        System.out.println(e.toString());
      }
      Path commitPath = commitDir;
      //copy files into commitDir
      for (File f : tracked) {
        Files.copy(f.toPath(), commitDir.toPath());
      }



    } //end if
  } //end method
}
