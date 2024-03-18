import java.io.File;
import java.io.IOException;
/** import java.io.FilenameFilter;
import java.nio.file.Files; **/
import java.util.ArrayList;
import java.util.List;

public class RecursiveDir {
    protected String dir;
    protected String fileName;
    
    /** class MyFileNameFilter implements FilenameFilter {
    String fname;
        public MyFileNameFilter (String fName){
        this.fname = fName;
        }
        public boolean accept(File dir, String name) {
        return name.toLowerCase().contains(fname);
        }
    } **/
    protected List<String> result = new ArrayList<String>();
    private List<String> getResult(){
        return result;
    }
    
    public void run(String dir, String fileName) throws IOException{
        RecursiveDir recurse = new RecursiveDir();
        recurse.setName(fileName);
        recurse.setDir(dir);
        recurse.searchDir(new File(recurse.getDir()), recurse.getName());
        int x = recurse.getResult().size();
        if(x == 0){
            System.out.println("No results found.");
        } else {
            System.out.println("\nFound+" +x+ " results!\n");
            for( String matched : recurse.getResult()){
                System.out.println("Found: "+ matched );
            }
        }
    }
    private void searchDir(File dir, String fileName2) {
        if(dir.isDirectory()){
            search(dir);
        } else {
            System.out.println(dir.getAbsolutePath() + " does not exist!");
        }
    }
    private void search(File dir) {
        if (dir.isDirectory()){
            if(dir.canRead()){
                for( File tmp : dir.listFiles()){
                    if(tmp.isDirectory()){
                        search(tmp);
                    } else {
                        if(tmp.getName().toLowerCase().contains(getName())){
                            result.add(tmp.getAbsolutePath().toString());
                        }
                    }

                }
            }
        } else {
            System.out.println("Denied.");
        }
    }
    private void setName(String fName){
        this.fileName = fName;
    }
    private void setDir(String dir){
        this.dir = dir;
    }
    private String getName(){
        return fileName;
    }
    private String getDir(){
        return this.dir;
    }
}
