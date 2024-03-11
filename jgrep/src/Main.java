import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

/**
 * This program is made to be a windows equivalent of grep because I used windows subsystem for linux daily just for grep lol
 */
class MyFileNameFilter implements FilenameFilter {
    String fname;
    public MyFileNameFilter (String fName){
        this.fname = fName;
    }
    public boolean accept(File dir, String name) {
        return name.startsWith(fname);
    }
}
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dir, fileName;
        System.out.println("Welcome to jgrep by allylavanda");

        // get directory and content/filename
        System.out.println("Enter the directory you would like to search: ");
        dir = sc.nextLine();
        System.out.println("Dir: "+dir);
        System.out.println("Enter the file name to search for: ");
        fileName = sc.nextLine();
        System.out.println("Content: "+fileName);


        System.out.println("Searching...");
        searchForFile(dir, fileName);
        sc.close();
    }

    private static void searchForFile(String dir, String fileName){
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
}
