package gitlet;

import java.io.IOException;
import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.Files;

public class FileHelper {
  public static void copyAllExcept(Path inputDir, Path outputDir, String skip) throws IOException {
    File[] listOfFiles = listFiles();
    for (File file : listOfFiles) {
      if (! (file.getName() == skip)) {
        Files.copy(file.toPath(), Path);
      } //end if
    } // end while
  }
}
