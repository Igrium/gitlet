import java.io.File;

public class Main {
  public static void main(String args[]) {
    if (args.length == 0) {
      System.out.println("Please enter a command.");
      System.exit(0);
    }
    if (args[0] == "init") {
      if(args.length != 1) { //make sure we have correct # of args
        System.out.println("usage: java gitlet.Main init");
        System.exit(0);
      } //end if
      if(isInitalized()) {
        System.out.println("You are already in an initalized directory.");
        System.exit(0);
      }
      //init code
    } else if(args[0] == "add") {
      if(args.length != 2) { //make sure we have correct # of args
        System.out.println("usage: java gitlet.Main add [file name]");
        System.exit(0);
      } //end if
      checkGitlet();
      //add code
    } else if(args[0] == "commit") {
      if(args.length != 2) { //make sure we have correct # of args
        System.out.println("usage: java gitlet.Main commit [message]");
        System.exit(0);
      } //end if
      checkGitlet();
      //code
    } else if(args[0] == "rm") {
      if(args.length != 2) { //make sure we have correct # of args
        System.out.println("usage: java gitlet.Main rm [file name]");
        System.exit(0);
      } //end if
      checkGitlet();
      //code
    } else if(args[0] == "log") {
      if(args.length != 1) { //make sure we have correct # of args
        System.out.println("usage: java gitlet.Main log");
        System.exit(0);
      } //end if
      checkGitlet();
      //code
    } else if(args[0] == "find") {
      if(args.length != 2) { //make sure we have correct # of args
        System.out.println("usage: java gitlet.Main find [commit message]");
        System.exit(0);
      } //end if
      checkGitlet();
      //code
    } else if(args[0] == "status") {
      if(args.length != 1) { //make sure we have correct # of args
        System.out.println("usage: java gitlet.Main status");
        System.exit(0);
      } //end if
      checkGitlet();
      //code
    } else if(args[0] == "checkout") {
      Object checkout = new Object();
      //checkout.run(args);
    } else if(args[0] == "branch") {
      if(args.length != 2) { //make sure we have correct # of args
        System.out.println("usage: java gitlet.Main branch [branch name]");
        System.exit(0);
      } //end if
      checkGitlet();
      //code
    } else if(args[0] == "rm-branch") {
      if(args.length != 2) { //make sure we have correct # of args
        System.out.println("usage: java gitlet.Main rm-branch [branch name]");
        System.exit(0);
      } //end if
      checkGitlet();
      //code
    } else if(args[0] == "reset") {
      if(args.length != 2) { //make sure we have correct # of args
        System.out.println("usage: java gitlet.Main reset [commit id]");
        System.exit(0);
      } //end if
      checkGitlet();
      //code
    } else if(args[0] == "merge") {
      if(args.length != 2) { //make sure we have correct # of args
        System.out.println("usage: java gitlet.Main merge [branch name]");
        System.exit(0);
      } //end if
      checkGitlet();
      //code
    } else {
      System.out.println(args[0]+" is not a command.");
      System.exit(0);
    }

  } //end method
  public static boolean isInitalized() {
    if (new File(".gitlet").exists()) {
      return true;
    } else {
      return false;
    }
  } //end method
  private static void checkGitlet() {
    if (isInitalized()) {
      return;
    } else {
      System.out.println("Error: you are not in a working Gitlet repository. Type \"java gitlet init\" to create one.");
      System.exit(0);
    }
  }
}
