import java.util.date;
import gitlet.Utils;
import java.io;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.nio.File;
import java.nio.Files;

class Branch impliments impliments java.io.Serializable {
  private String name;

  public Branch(String name1) {
    name = name1;
    if(new File(".gitlet/"+name1).exists()) {
      System.out.println("A branch with that name already exists!");
      System.exit(0);
    }
    if(name1.contains(" ")) {
      System.out.println("Brancg")
    }
  }
  public String getName() {
    return name;
  }

  public void setUp() {
    File branchDir = new File(".gitlet/"+name);
  }
}
