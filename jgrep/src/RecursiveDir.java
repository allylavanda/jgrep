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
                if(flist == null) {
                    System.out.println("Empty or non existing dir.");
                } else {
                    for(File tmp : directory.listFiles()){
                        if(tmp.isDirectory()){
                            search(tmp);
                        } else {
                            for (int i = 0; i < flist.length; i++) {
                                System.out.println(flist[i]+" found");
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
