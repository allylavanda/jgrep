import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;
public class CurrentDir implements Search{
    class MyFileNameFilter implements FilenameFilter {
    String fname;
        public MyFileNameFilter (String fName){
        this.fname = fName;
        }
        public boolean accept(File dir, String name) {
        return name.startsWith(fname);
        }
    }
    protected String dir;
    protected String fileName;
    private void getDir(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the directory you would like to search: ");
        this.dir = sc.nextLine();
        System.out.println("Dir: "+dir);
        System.out.println("Enter the file name to search for: ");
        this.fileName = sc.nextLine();
        System.out.println("Content: "+fileName);
        sc.close();
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
    public void run(){
        getDir();
        search(this.dir, this.fileName);
    }
}
