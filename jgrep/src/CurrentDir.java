import java.io.File;
import java.io.FilenameFilter;
public class CurrentDir implements Search{
    protected String dir;
    protected String fileName;
    
    class MyFileNameFilter implements FilenameFilter {
    String fname;
        public MyFileNameFilter (String fName){
        this.fname = fName;
        }
        public boolean accept(File dir, String name) {
        return name.startsWith(fname);
        }
    }

    public void search(String dir, String fileName){
        File directory = new File(dir);
        MyFileNameFilter filter = new MyFileNameFilter(fileName);
        String[] flist = directory.list(filter);

        if(flist == null) {
            System.out.println("Empty or non existing dir.");
        } else {
            for (int i = 0; i < flist.length; i++) {
                System.out.println(dir+flist[i]+" found");
            }
        }
    }
    public void run(String dir, String fileName){
        this.dir = dir;
        this.fileName = fileName;
        search(this.dir, this.fileName);
    }
}
