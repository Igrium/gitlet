import java.util.date;
import gitlet.Utils;
import java.io;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.nio.Files;
import java.nio.File;

public class CommitTester {
  public static void main(String[] args) {
    ArrayList <File> files = new ArrayList<File>(Arrays.asList(new File("test1.txt"), new File("test2.txt")));

    File workingDir = FileSystems.getDefault().getPath(".").toFile();
    Commit commit = new Commit("blah",files);
    commit.setMessage("test");
    commit.saveCommit();
  }
}
