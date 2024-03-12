import java.io.File;
import java.io.FilenameFilter;

public class RecursiveDir implements Search{
    class MyFileNameFilter implements FilenameFilter {
    String fname;
        public MyFileNameFilter (String fName){
        this.fname = fName;
        }
        public boolean accept(File dir, String name) {
        return name.startsWith(fname);
        }
    }

    @Override
    public void search(String dir, String fileName) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'search'");
    }
}
