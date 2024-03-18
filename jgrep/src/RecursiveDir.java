import java.io.File;
import java.io.FilenameFilter;

public class RecursiveDir {
    protected String dir;
    protected String fileName;

    class MyFileNameFilter implements FilenameFilter {
        String fname;
        public MyFileNameFilter (String fName){
            this.fname = fName;
        }
        public boolean accept(File dir, String name) {
            return name.toLowerCase().contains(fname);
        }
    }
    public void search(File directory){
        MyFileNameFilter filter = new MyFileNameFilter(this.fileName);
        String[] flist = directory.list(filter);
        if(directory.isDirectory()){
            if(directory.canRead()){
                if(flist != null) {
                    for(File tmp : directory.listFiles()){
                        if(tmp.isDirectory()){
                            search(tmp);
                        } else {
                            if(tmp.getAbsolutePath().toLowerCase().contains(this.fileName)){
                                System.out.println(tmp.getAbsolutePath());
                            }
                        }
                    }

                }
            }
        }
    }
    public void run(String dir, String fileName){
        this.dir = dir;
        this.fileName = fileName;
        search(new File(this.dir));
    }
}