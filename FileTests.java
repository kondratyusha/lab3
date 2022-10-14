import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class FileTests {
    @Test
    public void getFilesTest() throws IOException{
        List<File> ls = new ArrayList<>();
        File f = new File("some-files/a.txt");
        ls = FileExample.getFiles(f);
        System.out.println(ls);
    }
}
